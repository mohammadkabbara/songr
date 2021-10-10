package com.songr.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



    @Controller
    public class HelloWorld {
        @GetMapping("/hello")
        @ResponseBody
        public String getHelloWorld() {
            return "Hello World";
        }
    }


