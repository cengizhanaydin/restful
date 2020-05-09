package com.cengizhan.restful.helloworldbean.service;

import com.cengizhan.restful.helloworldbean.dto.HelloWorld;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public HelloWorld helloWorld(){
        return new HelloWorld("Hello World");
    }
}
