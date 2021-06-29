package com.portfolio.ann.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String welcome() {
        return "home";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }
}