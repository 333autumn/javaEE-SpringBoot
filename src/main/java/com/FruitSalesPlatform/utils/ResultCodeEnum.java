package com.FruitSalesPlatform.utils;

public enum ResultCodeEnum {

    /**
     * 成功：200-
     */
    SUCCESS(200,"请求成功"),
    /**
     * 失败：400-
     */
    ERROR(400,"请求失败"),
    USERNAME_NOT_EXIST(401,"用户名不存在"),
    PASSWORD_ERROR(402,"密码错误"),
    USERNAME_REPEAT(401,"用户名重复");
    /**
     * 用户错误：2001-2999
     */
    private final Integer code;

    private final String msg;

    ResultCodeEnum(Integer code, String msg){
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
