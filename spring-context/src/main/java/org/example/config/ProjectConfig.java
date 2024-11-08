package org.example.config;

import org.example.beans.Cat;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
public class ProjectConfig{

    @Bean
    @Qualifier("cat1")
    public Cat cat1(){
        Cat cat = new Cat();
        cat.setName("Bosbos");
        return cat;
    }

    @Bean
    @Qualifier("cat2")
    public Cat cat2(){
        Cat cat = new Cat();
        cat.setName("Basbosa");
        return cat;
    }

}
