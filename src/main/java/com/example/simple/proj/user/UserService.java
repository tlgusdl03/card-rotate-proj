package com.example.simple.proj.user;

import com.example.simple.proj.model.User;

public interface UserService {
    //회원 가입
    void join(String id, String email, String password);
    //회원정보 수정
    void edit(Long UserId, User newUser);
    //회원 탈퇴
    void withdraw(Long UserId);

    User findUser(String UserId);
}
