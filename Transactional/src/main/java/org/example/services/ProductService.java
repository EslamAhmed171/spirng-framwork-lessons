package org.example.services;

import org.example.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    /*
    *
    * - dirty reads
    * - repeatable reads
    * - phantom reads
    *
    *
    * */
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void addTenProducts() { // transaction created
        for (int i = 0; i < 10; i++) {
            productRepository.addProduct("Product " + i);
            if (i == 5)
                throw new RuntimeException(":((");
        }
    } // transaction commits
}
