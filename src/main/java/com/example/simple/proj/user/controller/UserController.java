package com.example.simple.proj.user.controller;

import com.example.simple.proj.user.model.User;
import com.example.simple.proj.user.service.UserService;
import com.example.simple.proj.user.service.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService = new UserServiceImpl();

    @GetMapping
    public String getAllUsers(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user/users";
    }

    @GetMapping("/new")
    public String showUserForm(Model model){
        model.addAttribute("user", new User());
        return "user/userForm";
    }

    @PostMapping
    public String createUser(@ModelAttribute User user){
        userService.join(user);
        System.out.println("User created");
        return "redirect:/users";
    }

    @GetMapping("edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model){
        User user = userService.findUser(id);
        if(user != null){
            model.addAttribute("user", user);
            return "user/userForm";
        } else {
            return "redirect:/users";
        }
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable Long id, @ModelAttribute User user){
        userService.edit(id, user);
        System.out.println("User edited");
        return "redirect:/users";
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.withdraw(id);
        return ResponseEntity.noContent().build();
    }
}
