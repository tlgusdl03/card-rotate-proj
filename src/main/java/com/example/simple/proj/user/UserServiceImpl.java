package com.example.simple.proj.user;

import com.example.simple.proj.model.User;

import java.util.Map;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository = new MemoryUserRepository();

    @Override
    public void join(String name, String email, String password) {
        User user = new User(name, email, password);
        userRepository.save(user);
    }

    @Override
    public void edit(Long UserId, User newUser) {
        userRepository.update(UserId, newUser);
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
    public Map<Long, User> findUsers() {
        return Map.of();
    }

    @Override
    public Map<Long, User> findAll() { return userRepository.findAll(); }
}
