package com.example.simple.proj.user;

import com.example.simple.proj.model.User;

import java.util.Map;

public interface UserService {
    //회원 가입
    void join(String name, String email, String password);
    //회원정보 수정
    void edit(User newUser);
    //회원 탈퇴
    void withdraw(Long UserId);
    //특정 유저 찾기
    User findUser(String name);
    //전체 유저 리스트 반환
    Map<Long, User> findAll();
}
