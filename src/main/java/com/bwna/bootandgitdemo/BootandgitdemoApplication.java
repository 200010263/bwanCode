package com.bwna.bootandgitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootandgitdemoApplication {

    public static void main(String[] args) {
        System.out.println("update");
        System.out.println("又更改了一次！");
        SpringApplication.run(BootandgitdemoApplication.class, args);
    }

}
