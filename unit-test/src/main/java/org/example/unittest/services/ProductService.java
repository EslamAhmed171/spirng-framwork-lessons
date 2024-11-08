package org.example.unittest.services;

import org.example.unittest.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<String> getProductNamesWithEvenNoOfChars() {
        return productRepository.getProductNames()
                .stream()
                .filter(name -> name.length() % 2 == 0)
                .toList();
    }
}
