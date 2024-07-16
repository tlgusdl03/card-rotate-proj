package com.example.simple.proj.user.repository;

import com.example.simple.proj.user.model.User;
import org.springframework.http.ResponseEntity;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class MemoryUserRepository implements UserRepository {

    private final static AtomicLong counter = new AtomicLong(0);
    private final static Map<Long, User> store = new HashMap<>();
    @Override
    public User save(User user) {
        if(user.getId() == null) {
            user.setId(counter.incrementAndGet());
        }
        store.put(user.getId(), user);
        return user;
    }

    @Override
    public void delete(Long UserId) {
        store.remove(UserId);
    }

    @Override
    public Optional<User> findById(Long UserId) {
        return Optional.ofNullable(store.get(UserId));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(store.values());
    }
}
