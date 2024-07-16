package com.example.simple.proj.user.service;

import com.example.simple.proj.user.repository.MemoryUserRepository;
import com.example.simple.proj.user.repository.UserRepository;
import com.example.simple.proj.user.model.User;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = new MemoryUserRepository();

    @Override
    public User join(String name, String email, String password) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        return userRepository.save(user);
    }

    @Override
    public Optional<User> edit(User newUser) {
        userRepository.save(newUser);
    }

    @Override
    public boolean withdraw(Long UserId) {
        return userRepository.delete(UserId);
    }

    @Override
    public Optional<User> findUser(Long UserId) {
        return userRepository.findById(UserId);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
