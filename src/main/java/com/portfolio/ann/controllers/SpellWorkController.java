package com.portfolio.ann.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpellWorkController {
    @GetMapping("/spellwork")
    public String showSpell() {return "spellwork";
    };

}
