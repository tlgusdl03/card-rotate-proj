package com.example.simple.proj.user.controller;

import com.example.simple.proj.user.model.User;
import com.example.simple.proj.user.service.UserService;
import com.example.simple.proj.user.service.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService = new UserServiceImpl();

    @GetMapping
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        Optional<User> user = userService.findUser(id);
        return user.isPresent() ? ResponseEntity.ok(user.get()) : ResponseEntity.notFound().build();
    }

    @GetMapping("user/sign_up/form")
    public String signUpForm(){
        return "user/sign_up/form";
    }

    @PostMapping("user/sign_up/request")
    public String signUpRequest(@ModelAttribute("id") String id, @ModelAttribute("name") String name, @ModelAttribute("email") String email, @ModelAttribute("password") String password){
        userService.join(name, email, password);
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
