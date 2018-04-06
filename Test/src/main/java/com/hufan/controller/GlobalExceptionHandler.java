package com.hufan.controller;

import com.hufan.exception.BusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hufan on 2018/4/5.
 */

/**
 * @ControllerAdvice 处理controller中所有没有被try catch包裹的注解
 * @ResponseBody 返回json格式
 * @ExceptionHandler 针对哪种类型的异常
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> handlerException(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 500);
        map.put("msg", "系统繁忙请稍后再试！");
        return map;
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Map<String, Object> handlerBusinessException(BusinessException businessException){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", businessException.getCode());
        map.put("msg", businessException.getMsg());
        map.put("desc", businessException.getDesc());
        return map;
    }

}
