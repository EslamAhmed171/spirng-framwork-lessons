package org.example.springdata.controllers;

import org.example.springdata.entities.Product;
import org.example.springdata.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController{

    final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    @PostMapping("add")
//    public void addProduct(@RequestBody Product product){
//        productRepository.save(product);
//    }
//
//    @GetMapping("/get/{name}")
//    public Product getProduct(@PathVariable String name){
//        return productRepository.findByName(name);
//    }

    @GetMapping("/sort")
    public Iterable<Product> getAllSortedDescendingById(){
        return productRepository.findAll(Sort.by("id").descending());
    }

    @GetMapping("/page/{page}")
    public Page<Product> getProductsByPage(@PathVariable int page){
        return productRepository.findAll(PageRequest.of(page, 1, Sort.by("id").descending()));
    }

    @GetMapping("/name/{name}/{page}")
    public List<Product> getProductsByName(@PathVariable String name,
                                           @PathVariable int page){
        return productRepository.findProductsByName(name, PageRequest.of(page, 1, Sort.by("id").descending()));
    }
}
