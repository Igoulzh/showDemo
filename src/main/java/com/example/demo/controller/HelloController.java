package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello1";
    }
    @RequestMapping("/bye")
    public String bye(){
        return "bye-bye";
    }
    @RequestMapping("/xixi")
    public String xixi(){
        return "xx";
    }

}
