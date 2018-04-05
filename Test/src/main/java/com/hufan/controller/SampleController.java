package com.hufan.controller;

import com.hufan.com.hufan.exception.BusinessException;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * @EnableAutoConfiguration  帮你自动引入Spring所需要的bean，它是spring boot核心注解
 * @RestController is @Controller + @ResponseBody
 * @RestController 下面所以方法都返回json格式
 */

//@Controller
@RestController
//@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    //@ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/home1")
    public String home1() {
        int i = 2/0;
        return "home1：全局异常处理";
    }

    @RequestMapping("/home2")
    public  String home2() {
        try{
            int i = 2/0;
        }catch (Exception e) {

        }
        return "home2 i = 2/1，try catch异常捕获";
    }

    @RequestMapping("/home3")
    public  String home3() throws BusinessException {
        throw new BusinessException(404,"地址不存在，请重新检查输入地址！","事物异常处理");
    }

    /*public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }*/
}