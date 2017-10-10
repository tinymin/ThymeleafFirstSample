package com.tinymin.thymeleaftest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {
    @Value("${welcome2.message:test}")
    private String msg = "Hello World";

    @RequestMapping
    public String welcome(Map<String, Object> model) {
        model.put("message", this.msg);
        return "welcome";
    }
}
