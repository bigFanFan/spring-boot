package com.hufan.controller;

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
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    //@ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}