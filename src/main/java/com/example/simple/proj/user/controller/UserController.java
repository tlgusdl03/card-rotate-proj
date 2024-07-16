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
        User user = userService.findUser(id);
        if(user == null){
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok(user);
        }
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.join(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user){
        User updatedUser = userService.edit(id, user);
        if(updatedUser == null){
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok(updatedUser);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id){
        userService.withdraw(id);
    }

}
