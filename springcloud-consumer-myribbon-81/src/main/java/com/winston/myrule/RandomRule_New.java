package com.winston.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author Winston
 * @title: RandomRule_New
 * @projectName springcloud
 * @description:
 * @date 2019/6/13 9:48
 */
@ConfigurationProperties(prefix = "winston.rule")
@Data
public class RandomRule_New extends AbstractLoadBalancerRule {


    // 总共被调用的次数，目前要求每台被调用5次
    private int total = 0;
    // 当前提供服务的机器号
    private int currentIndex = 0;

    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;
        while (server == null) {
            // 线程是否被中断
            if (Thread.interrupted()) {
                return null;
            }
            // 存活的微服务
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == 0) {
                return null;
            }

//            int index = random.nextInt(serverCount);
//            server = upList.get(index);

            if (total < 5) {
                server = upList.get(currentIndex);
                total++;
            } else {
                total = 0;
                currentIndex++;
                if (currentIndex >= upList.size()) {
                    currentIndex = 0;
                }
            }

            if (server == null) {
                Thread.yield();
                continue;
            }
            if (server.isAlive()) {
                return (server);
            }

            server = null;
            Thread.yield();
        }
        return server;
    }

    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }
}
