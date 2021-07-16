package com.bwna.bootandgitdemo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

    public String hello(){
        return "hello world!";
    }
}
