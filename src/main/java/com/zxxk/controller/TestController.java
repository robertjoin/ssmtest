package com.zxxk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
//测试hha
public class TestController {
    @RequestMapping("/test")
    public String Test() {
        System.out.println("test");
        return "test";
    }
}
