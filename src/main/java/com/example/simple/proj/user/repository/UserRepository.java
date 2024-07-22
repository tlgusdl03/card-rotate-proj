package com.example.simple.proj.user.repository;

import com.example.simple.proj.user.model.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    void delete(Long UserId);
    User findById(Long UserId);
    List<User> findAll();
}
