package com.skypro.greeter0504257;

import com.skypro.greeter0504257.service.GreeterService;
import com.skypro.greeter0504257.service.RandomHelloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterServiceTest {
    private final GreeterService greeterService = new GreeterService(new RandomHelloService());

//    public GreeterServiceTest(GreeterService greeterService) {
//        this.greeterService = greeterService;
//    }
    @Test
    @DisplayName("Позитивный сценарий метода validNameReturnsHello")// whenTheNameIsValidReturnsHelloName
    public void validNameReturnsHello() {
        String result = greeterService.greeter("Johan");
        Assertions.assertEquals("Hello, Johan", result);
    }
    @Test
    @DisplayName("Негативный сценарий метода NameIsNullReturnsAnonymous")// whenTheNameIsValidReturnsHelloName
    public void NameIsNullReturnsAnonymous() {
        String result = greeterService.greeter(null);
        Assertions.assertEquals("Hello, Anonymous", result);
    }
    @Test
    @DisplayName("Негативный сценарий метода NameIsBlankReturnsAnonymous")// whenTheNameIsValidReturnsHelloName
    public void NameIsBlankReturnsAnonymous() {
        String result = greeterService.greeter("");
        Assertions.assertEquals("Hello, Anonymous", result);
    }


}
