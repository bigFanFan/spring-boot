package com.hufan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Hufan on 2018/4/5.
 */

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.hufan.controller")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
