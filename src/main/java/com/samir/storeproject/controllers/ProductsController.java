package com.samir.storeproject.controllers;

import com.samir.storeproject.models.Product;
import com.samir.storeproject.services.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("/products")
public class ProductsController {
    @Autowired
    private ProductRepository repo;

    @GetMapping( {"", "/"})
    public String showProductList (Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index";
    }
}
