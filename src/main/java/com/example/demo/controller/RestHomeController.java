package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 9. 2..
 */

@RestController
public class RestHomeController {

        @GetMapping ("/rest")
        public String helloWorld() {
                return "rest";
        }

}
