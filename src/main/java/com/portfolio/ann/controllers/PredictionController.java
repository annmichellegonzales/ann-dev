package com.portfolio.ann.controllers;

import com.portfolio.ann.models.Dress;
import com.portfolio.ann.repositories.DressRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PredictionController {

    private final DressRepo dressRepo;

    public PredictionController(DressRepo dressRepo) {
        this.dressRepo = dressRepo;
    }



    @GetMapping("/prediction")
    public String predictionResult() {
        return "prediction";
    }


    @GetMapping("/prediction")
    public String randomizeDbDresses(Model model){
        List<Dress> dresses = dressRepo.findAll();
        int randomNum = (int)(Math.random() * dresses.size());
        model.addAttribute("dress", dresses.get(randomNum));
        model.addAttribute("randomNum", "My crystal ball says: " + randomNum);
        return "/prediction";
    }

}