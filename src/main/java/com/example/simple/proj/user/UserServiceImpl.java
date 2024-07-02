package com.example.simple.proj.user;

import com.example.simple.proj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository = new MemoryUserRepository();

    @Override
    public void join(String id, String email, String password) {
        if(findUser(id)!=null){

        }
        User user = new User(id, email, password);
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
    public User findUser(String UserId) {
        return userRepository.findById(UserId);
    }
}
