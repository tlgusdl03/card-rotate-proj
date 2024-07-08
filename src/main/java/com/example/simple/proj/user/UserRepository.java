package com.example.simple.proj.user;

import com.example.simple.proj.model.User;

import java.util.Map;

public interface UserRepository {
    void save(User user);
    void update(Long UserId, User newUser);
    void delete(Long UserId);
    User findById(Long UserId);
    Map<Long, User> findAll();
}
