package com.love2code.springboot.quicktrip.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quicktrip")
public class QuicktripRestController {

    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }
    
}
