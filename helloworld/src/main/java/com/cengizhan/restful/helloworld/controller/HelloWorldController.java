package com.cengizhan.restful.helloworld.controller;

import com.cengizhan.restful.helloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/helloworld")
    public String helloWorld(){
        return helloWorldService.helloWorld();
    }
}
