package com.aardwark.university.bookShop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String printHello(){
        return "Welcome to the Book Shop";
    }
}
