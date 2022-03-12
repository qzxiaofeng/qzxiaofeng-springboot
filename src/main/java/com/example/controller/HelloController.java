package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/index")
    public String Index(){
        return "index";
    }
    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }
}

