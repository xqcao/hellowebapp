package com.helloweb.simplewebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome home";
    }

    @requestMapping("/hi")
    public String sayHI() {
        return "HI, Nice to see you";
    }
}
