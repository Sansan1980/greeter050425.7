package com.skypro.greeter0504257.service;

import java.util.Random;

public class RandomHelloService {
    private Random random;

    public RandomHelloService() {
        this.random = new Random();
    }

    public String randomHello() {
        return switch (random.nextInt(1, 5)) {
            case 1 -> "Hello, ";
            case 2 -> "Privet, ";
            case 3 -> "Salyt, ";
            default -> "Hi, ";
        };
    }
}
