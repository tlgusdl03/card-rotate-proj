package com.example.simple.proj.controller;

import com.example.simple.proj.model.User;
import com.example.simple.proj.user.UserService;
import com.example.simple.proj.user.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserService userService = new UserServiceImpl();

    @GetMapping("user/sign_up/form")
    public String signUpForm(){
        return "user/sign_up/form";
    }

    @PostMapping("user/sign_up/request")
    public String signUpRequest(@ModelAttribute("id") String id, @ModelAttribute("email") String email, @ModelAttribute("password") String password){
        userService.join(id, email, password);
        return "redirect:/";
    }

    @GetMapping("user/sign_in/form")
    public String signInForm(){
        return "user/sign_in/form";
    }

//    @PostMapping("user/sign_in/request")
//    public String signInRequest(@ModelAttribute("id") String id, @ModelAttribute("password") String password){
//        if(userService.findUser())
//    }

}
