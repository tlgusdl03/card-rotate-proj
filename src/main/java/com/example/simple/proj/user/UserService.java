package com.example.simple.proj.user;

import com.example.simple.proj.model.User;

public interface UserService {
    //회원 가입
    void join(User user);
    //회원정보 수정
    void edit(Long UserId, User newUser);
    //회원 탈퇴
    void withdraw(Long UserId);

    User findUser(Long UserId);
}
