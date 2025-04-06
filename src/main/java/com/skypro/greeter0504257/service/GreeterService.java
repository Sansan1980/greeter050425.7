package com.skypro.greeter0504257.service;

import com.skypro.greeter0504257.model.User;
import org.springframework.stereotype.Service;

@Service
public class GreeterService {
    private RandomHelloService randomHelloService;

//    public GreeterService() {
//        this.randomHelloService = new RandomHelloService();
//    }

    public GreeterService(RandomHelloService randomHelloService) {
        this.randomHelloService = randomHelloService;
    }

    public String greeter(String name) {
        if (name == null || name.isBlank()) {
            String hello = randomHelloService.randomHello();
            System.out.println(hello + "Anonymous");
            return (hello + "Anonymous");

        } else {
            String hello = randomHelloService.randomHello();
            System.out.println(hello + name);
            return hello + name;
        }
    }

}
