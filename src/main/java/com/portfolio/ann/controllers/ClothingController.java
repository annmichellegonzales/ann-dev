package com.portfolio.ann.controllers;

import com.portfolio.ann.models.Dress;
import com.portfolio.ann.repositories.DressRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClothingController {

    private final DressRepo dressRepo;

    public ClothingController(DressRepo dressRepo) {
        this.dressRepo = dressRepo;
    }

    @GetMapping("/dresses")
    public String dresses(Model model){
        List<Dress> dresses = dressRepo.findAll();
        model.addAttribute("dress", dresses);
        return "/dresses";
    }







}
