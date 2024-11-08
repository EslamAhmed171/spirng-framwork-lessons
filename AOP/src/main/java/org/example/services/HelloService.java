package org.example.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {
    public String sayHello(List<String> names) {
        for (String name : names) {
            System.out.println("Hello " + name);
        }
        return "finished";
    }
}
