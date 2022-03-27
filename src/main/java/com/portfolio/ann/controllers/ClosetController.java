package com.portfolio.ann.controllers;

import com.portfolio.ann.repositories.ClosetRepo;
import org.springframework.stereotype.Controller;

@Controller
public class ClosetController {

    public ClosetController(ClosetRepo closetDao) {
    }

//    @GetMapping("/closet/create")
//    public String showCreateForm {
//        model.addAttribute("closet", new Closet());
//        return "closet/create";
//    }
//
//    @PostMapping("closet/create")
//    public void saveCloset(@ModelAttribute Closet closet) {
//        closet.setEmail(closet.getEmail());
//        closetDao.save(closet);
//    }
}