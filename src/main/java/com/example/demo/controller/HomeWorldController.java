package com.example.demo.controller;

import com.example.demo.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 9. 2..
 */

@Controller
public class HomeWorldController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("portfolioList", portfolioService.findAll());
        return "home";

    }

}
