package com.cengizhan.restful.pathvariable.controller;

import com.cengizhan.restful.pathvariable.dto.HelloMessage;
import com.cengizhan.restful.pathvariable.service.PathVariableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @Autowired
    PathVariableService pathVariableService;

    @GetMapping("hello/{name}")
    public HelloMessage sendHelloMessage(@PathVariable String name){
        return pathVariableService.sendHelloMessage(name);
    }
}
