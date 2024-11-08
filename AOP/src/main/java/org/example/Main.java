package org.example;

import org.example.config.ProjectConfig;
import org.example.services.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try(var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            HelloService helloService = c.getBean(HelloService.class);
            String result = helloService.sayHello(new ArrayList<>(Arrays.asList("Eslam", "Ebrahim")));
            System.out.println("Result: " + result);
        }
    }
}