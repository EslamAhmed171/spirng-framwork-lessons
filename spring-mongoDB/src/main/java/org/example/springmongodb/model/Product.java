package org.example.springmongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;
import java.security.PublicKey;
import java.util.UUID;

@Document
public class Product {

    private String id;
    private String name;

    public Product(){
        this.id = UUID.randomUUID().toString();
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
