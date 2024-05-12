package com.example.simple.proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @GetMapping("card")
    public String card(Model model){
        model.addAttribute("data", "Hello World");
        System.out.println("card 페이지에 접근함");
        return "card";
    }
}
