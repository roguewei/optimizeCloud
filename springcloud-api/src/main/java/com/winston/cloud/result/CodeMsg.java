package com.winston.cloud.result;

import lombok.Data;

/**
 * @ClassName CodeMsg
 * @Description
 * @Author Winston
 * @Date 2019/4/15 10:08
 * @Version 1.0
 **/
@Data
public class CodeMsg {

    /**
     * 数据状态的字段名称，默认：code
     * 成功的状态码，默认：200
     */

    Integer status;

    String message;

    private CodeMsg(Integer status, String message){
        this.status = status;
        this.message = message;
    }

    // 通用异常5001XX
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");

    // 登录模块5002XX
    public static CodeMsg PASSWORD_EMPTY = new CodeMsg(500200, "密码不能为空");
}
