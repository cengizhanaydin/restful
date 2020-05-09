package com.cengizhan.restful.helloworldbean.controller;

import com.cengizhan.restful.helloworldbean.dto.HelloWorld;
import com.cengizhan.restful.helloworldbean.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("/helloworld")
    public HelloWorld helloWorld(){
        return  helloWorldService.helloWorld();
    }
}
