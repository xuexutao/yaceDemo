package com.xxtyace.Common;

import com.xxtyace.Enum.ResultCodeEnum;

import java.io.Serializable;


public class Result<T> implements Serializable {
    private static final long serialVersionUID = -3960261604605958516L;

    private int code;
    private String msg;
    private T data;

    public static <T>Result<T> success(){
        return new Result<>();
    }

    public static <T>Result<T> success(T data){
        return new Result<>(data);
    }

    public static <T>Result<T> success(String msg){
        return new Result<>(msg);
    }

    public static <T>Result<T> success(String msg, T data){
        return new Result<>(msg, data);
    }

    public static <T>Result<T> error(){
        return new Result<>(ResultCode.ERROR);
    }


    public static <T>Result<T> error(String msg){
        return new Result<>(ResultCode.ERROR.getCode(), msg);
    }

    public static <T>Result<T> error(int code, String msg){
        return new Result<>(code, msg);
    }
    public static <T>Result<T> error(ResultCode resultCode){
        return new Result<>(resultCode);
    }


    /**
     * 构造器
     */
    private Result() {
        this(ResultCode.SUCCESS);
    }
    public Result(T data) {
        this(ResultCode.SUCCESS, data);
    }
    private Result(String msg) {
        this(ResultCode.SUCCESS.getCode(), msg);
    }
    private Result(String msg, T data) {
        this(ResultCode.SUCCESS.getCode(), msg, data);
    }
    private Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    private Result(int code, String msg, T data) {
        this(code, msg);
        this.data = data;
    }
    private Result(ResultCode resultCode) {
        this(resultCode.getCode(), resultCode.getMsg());
    }
    private Result(ResultCode resultCode, T data) {
        this(resultCode);
        this.data = data;
    }
}
