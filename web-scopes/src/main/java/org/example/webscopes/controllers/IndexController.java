package org.example.webscopes.controllers;

import org.example.webscopes.services.RandomNumber;
import org.example.webscopes.services.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final RandomNumber randomNumber;;

    public IndexController(RandomNumber randomNumber) {
        this.randomNumber = randomNumber;
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", randomNumber.getValue());
        return "index.html";
    }
}
