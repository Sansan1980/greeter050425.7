package com.skypro.greeter0504257.service;

import com.skypro.greeter0504257.model.User;
import org.springframework.stereotype.Service;

@Service
public class GreeterService {
    public String greeter(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Hello, Anonymous");
            return "Hello, Anonymous";

        } else{
            System.out.println("Hello," + name);
        }
        return "Hello, " + name;
    }

}
