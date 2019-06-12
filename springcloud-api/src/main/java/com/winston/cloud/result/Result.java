package com.winston.cloud.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Winston
 * @title: Result
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 10:14
 */
@Data
public class Result<T> implements Serializable {

    Integer status;
    Integer count;
    String message;
    T data;

    private Result(T data){
        this.status = 200;
        this.count = 1;
        this.message = "success";
        this.data = data;
    }

    private Result(CodeMsg codeMsg){
        this.status = codeMsg.status;
        this.message = codeMsg.message;
        this.count = 1;
    }

    public static <T> Result success(T data){
        return new Result<T>(data);
    }

    public static Result error(CodeMsg codeMsg){
        return new Result(codeMsg);
    }

}
