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
    public User edit(Long UserId, User user) {
        User newUser = findUser(UserId);
        if(newUser != null) {
            newUser.setName(user.getName());
            newUser.setEmail(user.getEmail());
            newUser.setPassword(user.getPassword());
            return userRepository.save(newUser);
        }
        return null;
    }

    @Override
    public void withdraw(Long UserId) {
         userRepository.delete(UserId);
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
