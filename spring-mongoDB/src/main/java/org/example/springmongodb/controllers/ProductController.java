package org.example.springmongodb.controllers;

import org.example.springmongodb.model.Product;
import org.example.springmongodb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product) {
        productRepository.insert(product);
    }

    @GetMapping("/get")
    public List<Product> getProduct() {
        return productRepository.findAll();
    }
}
