package com.example.simple.proj.user;

import com.example.simple.proj.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class MemoryUserRepository implements UserRepository{

    private static Map<Long, User> store = new HashMap<>();
    @Override
    public void save(User user) {
        store.put(user.getId(), user);
    }

    @Override
    public void update(Long UserId, User newUser) {
        if(store.containsKey(UserId)){
            store.put(UserId, newUser);
        }else{
            throw new NoSuchElementException("User with ID " + UserId + " not found.");
        }
    }

    @Override
    public void delete(Long UserId) {
        store.remove(UserId);
    }

    @Override
    public User findById(Long UserId) {
        return store.get(UserId);
    }
}
