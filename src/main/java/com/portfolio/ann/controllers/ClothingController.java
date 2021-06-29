package com.portfolio.ann.controllers;

import com.portfolio.ann.models.Dress;
import com.portfolio.ann.models.Purse;
import com.portfolio.ann.models.Shoes;
import com.portfolio.ann.repositories.DressRepo;
import com.portfolio.ann.repositories.PurseRepo;
import com.portfolio.ann.repositories.ShoesRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClothingController {

    private final DressRepo dressRepo;
    private final PurseRepo purseRepo;
    private final ShoesRepo shoesRepo;

    public ClothingController(DressRepo dressRepo, PurseRepo purseRepo, ShoesRepo shoesRepo) {
        this.dressRepo = dressRepo;
        this.purseRepo = purseRepo;
        this.shoesRepo = shoesRepo;
    }

    @GetMapping("/dresses")
    public String showDresses(Model model){
        List<Dress> dresses = dressRepo.findAll();
        model.addAttribute("dress", dresses);
        return "/dresses";
    }

    @GetMapping("/purses")
    public String showPurses(Model model){
        List<Purse> purses = purseRepo.findAll();
        model.addAttribute("purse", purses);
        return "/purses";
    }

    @GetMapping("/shoes")
    public String showShoes(Model model){
        List<Shoes> shoesList = shoesRepo.findAll();
        model.addAttribute("shoes", shoesList);
        return "/shoes";
    }







}
