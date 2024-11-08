package org.example;
import org.example.beans.Cat;
import org.example.beans.Owner;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
//            Cat cat = context.getBean(Cat.class);
            Owner owner = context.getBean(Owner.class);

//            cat.setName("Bosbos");
//            System.out.println(cat);
            System.out.println(owner);
        }
    }
}