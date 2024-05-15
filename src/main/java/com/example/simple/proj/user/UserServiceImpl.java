package com.example.simple.proj.user;

import com.example.simple.proj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void join(User user) {
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


}
