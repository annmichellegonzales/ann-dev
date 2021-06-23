package com.portfolio.ann.controllers;

import com.portfolio.ann.models.Closet;
import com.portfolio.ann.repositories.ClosetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClosetController {

    private final ClosetRepository closetDao;

    public ClosetController(ClosetRepository closetDao) {
        this.closetDao = closetDao;
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