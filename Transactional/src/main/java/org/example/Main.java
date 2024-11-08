package org.example;

import org.example.config.ProjectConfig;
import org.example.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            var ps = context.getBean(ProductService.class);
            ps.addTenProducts();
        }
    }
}