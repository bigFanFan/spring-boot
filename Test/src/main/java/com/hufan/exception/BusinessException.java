package com.hufan.exception;

/**
 * Created by Hufan on 2018/4/5.
 */

/**
 * BusinessException 业务异常处理类
 * alt + insert 快速生成set和get方法
 */
public class BusinessException extends Exception{
    private Integer code;   //异常处理编码
    private String msg;     //异常处理信息
    private String desc;    //异常具体描述

    public BusinessException(Integer code,String msg,String desc) {
        this.code = code;
        this.msg = msg;
        this.desc = desc;
    }

    public BusinessException(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
