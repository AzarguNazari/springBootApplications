package com.example.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }

    @GetMapping("/api/helloworld")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/api/second")
    public String second(){
        return "Hello World";
    }

}
