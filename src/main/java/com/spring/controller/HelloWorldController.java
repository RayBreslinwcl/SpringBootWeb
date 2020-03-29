package com.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/3/29.
 */
@RestController
public class HelloWorldController {


    @RequestMapping("/hello")
    public String HelloWorld(){
        return "Hello world!";
    }
}
