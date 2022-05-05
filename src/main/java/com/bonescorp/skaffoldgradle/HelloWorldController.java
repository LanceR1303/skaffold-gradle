package com.bonescorp.skaffoldgradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot! Testing Skaffold Variae";
    }

}
