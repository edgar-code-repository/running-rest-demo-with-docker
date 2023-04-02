package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!!!";
    }

    @GetMapping("/hello-to-you/{name}")
    public String helloToYou(@PathVariable String name) {
        return "Hello " + name + "!!!";
    }

}
