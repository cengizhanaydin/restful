package com.cengizhan.restful.pathvariable.service;

import com.cengizhan.restful.pathvariable.dto.HelloMessage;
import org.springframework.stereotype.Service;

@Service
public class PathVariableService {

    public HelloMessage sendHelloMessage(String name){
        return new HelloMessage( "Hi " + name);
    }
}
