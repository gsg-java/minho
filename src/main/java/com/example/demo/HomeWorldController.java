package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 9. 2..
 */

@Controller
public class HomeWorldController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("test", "aaaa");
        return "home";
    }

}
