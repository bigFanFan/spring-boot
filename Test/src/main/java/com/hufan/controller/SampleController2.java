package com.hufan.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * @EnableAutoConfiguration  帮你自动引入Spring所需要的bean，它是spring boot核心注解
 * @RestController is @Controller + @ResponseBody
 * @RestController 下面所以方法都返回json格式，不返回页面
 * @Controller 可以返回页面
 */

@Controller
//@RestController
//@EnableAutoConfiguration
public class SampleController2 {

    @RequestMapping("index")
    public String index() {
        return "index";
    }


}