package org.example.main;

import org.example.config.ProjectConfig;
import org.example.model.Product;
import org.example.repositories.ProductRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            ProductRepository productRepo = context.getBean(ProductRepository.class);
//            Product product = new Product();
//
//            product.setName("T-shirt");
//            product.setPrice(10.99);
//            productRepo.addProduct(product);

            List<Product> products = productRepo.getAllProducts();
            products.forEach(System.out::println);
        }
    }
}