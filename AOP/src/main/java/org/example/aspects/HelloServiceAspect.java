package org.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;

@Aspect
@Component
public class HelloServiceAspect {

//    @Before("execution(* org.example.services.HelloService.sayHello(..))")
//    public void before(){
//        System.out.println("A");
//    }
//
//    @After("execution(* org.example.services.HelloService.sayHello(..))")
//    public void after(){
//        System.out.println("B");
//    }
//
//    @AfterReturning("execution(* org.example.services.HelloService.sayHello(..))")
//    public void afterReturning(){
//        System.out.println("C");
//    }
//
//    @AfterThrowing("execution(* org.example.services.HelloService.sayHello(..))")
//    public void afterThrowing(){
//        System.out.println("D");
//    }

    @Around("execution(* org.example.services.HelloService.sayHello(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("A");
        Object result = pjp.proceed(new Object[]{new ArrayList<>(Arrays.asList("Ahmed", "Omar"))});
        System.out.println("B");
        return result;
    }
}
