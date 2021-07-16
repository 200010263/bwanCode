package com.bwna.bootandgitdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

    public String hello(){
        System.out.println("gitee have update");
        System.out.println("master commit!");
        System.out.println("second commit!");
        System.out.println("second commit2");
        System.out.println("second commit3");
        return "hello world!";
    }
}
