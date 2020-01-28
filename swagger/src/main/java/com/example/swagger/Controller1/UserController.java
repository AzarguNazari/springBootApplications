package com.example.swagger.Controller1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/test/first")
    public String firstExample(){
        return "first";
    }

    @GetMapping("/test/second")
    public String secondExample(){
        return "second";
    }

    @GetMapping("/test/thrid")
    public String thirdExample(){
        return "third";
    }

    @GetMapping("/test/forth")
    public String forthExample(){
        return "forth";
    }

    @GetMapping("/anotherOne/first")
    public String fifthOne(){
        return "fifth";
    }
}
