package com.facade.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.model.Product;

@FeignClient(name = "microservice-produits", url = "localhost:9001")
public interface MicroserviceProduitsFacade {


    @GetMapping(value = "/Produits")
    public List<Product> listeDesProduits();

    //Récuperer un produit par son id
    @GetMapping( value = "/Produits/{id}")
    public Optional<Product> recupererUnProduit(@PathVariable int id) ;
}
