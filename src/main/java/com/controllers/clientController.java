package com.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.facade.rest.MicroserviceProduitsFacade;
import com.model.Product;

@Controller
public class clientController {

    @Autowired
  private MicroserviceProduitsFacade microserviceProduitsFacade;

    @GetMapping("/")
    public String accueil(Model model){

        List<Product> produits =  microserviceProduitsFacade.listeDesProduits();

        model.addAttribute("produits", produits);

        return "welcome";
    }
}
