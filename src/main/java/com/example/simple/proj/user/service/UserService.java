package com.example.simple.proj.user.service;

import com.example.simple.proj.user.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    //회원 가입
    User join(String name, String email, String password);
    //회원정보 수정
    Optional<User> edit(User newUser);
    //회원 탈퇴
    boolean withdraw(Long UserId);
    //특정 유저 찾기
    Optional<User> findUser(Long UserId);
    //전체 유저 리스트 반환
    List<User> findAll();
}
