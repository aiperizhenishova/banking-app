package com.example.bankingapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/example")
    public String example(){
        throw new RuntimeException("Example of an error");
    }
}
