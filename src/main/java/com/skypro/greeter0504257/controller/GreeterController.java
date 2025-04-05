package com.skypro.greeter0504257.controller;

import com.skypro.greeter0504257.service.GreeterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
    GreeterService greeterService;

    public GreeterController(GreeterService greeterService) {
        this.greeterService = greeterService;
    }

    @GetMapping("/greet")
    public String greeter(@RequestParam(value = "name",required = false) String name) {
        return greeterService.greeter(name);
    }
}
