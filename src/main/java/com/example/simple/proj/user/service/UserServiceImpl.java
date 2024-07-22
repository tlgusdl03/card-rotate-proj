package com.example.simple.proj.user.service;

import com.example.simple.proj.user.repository.MemoryUserRepository;
import com.example.simple.proj.user.repository.UserRepository;
import com.example.simple.proj.user.model.User;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = new MemoryUserRepository();

    @Override
    public User join(User user) {
        return userRepository.save(user);
    }

    @Override
    public User edit(Long id, User newUser) {
        User user = userRepository.findById(id);
        if(user != null) {
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public boolean withdraw(Long UserId) {
        User user = userRepository.findById(UserId);
        if(user != null) {
            userRepository.delete(UserId);
            return true;
        }
        return false;
    }

    @Override
    public User findUser(Long UserId) {
        return userRepository.findById(UserId);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
