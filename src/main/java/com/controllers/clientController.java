package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class clientController {

    @GetMapping("/")
    public String accueil(Model model){
        return "welcome";
    }
}
