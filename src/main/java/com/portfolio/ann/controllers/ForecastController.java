package com.portfolio.ann.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForecastController {
    @GetMapping("/forecast")
    public String showWeather() {
        return "forecast";
    }
}
