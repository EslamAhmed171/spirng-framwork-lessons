package org.example.morerest.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Map;

@RestController
public class HelloController {
    @PostMapping("/test")
    public String test(@RequestHeader final String a,
                       @RequestHeader final String b,
                       @RequestHeader final String c,
                       HttpServletResponse response){
        response.addHeader("test", "Hello world!!!");
        return a + " " + b + " " + c;
    }

    @GetMapping("all")
    public Map<String, String> all(@RequestHeader Map<String, String> headers){
        return headers;
    }

    @GetMapping(path = "/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public byte[] file(){
        byte[] bytes = new byte[128];
        return bytes;
    }
}
