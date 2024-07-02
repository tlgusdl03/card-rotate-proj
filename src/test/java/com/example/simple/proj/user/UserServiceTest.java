//package com.example.simple.proj.user;
//
//import com.example.simple.proj.model.User;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//public class UserServiceTest {
//
//    UserService userService;
//    UserRepository userRepository;
//
//    @BeforeEach
//    void beforeEach(){
//        userRepository = new MemoryUserRepository();
//        userService = new UserServiceImpl(userRepository);
//    }
//    @Test
//    @DisplayName("회원 가입 테스트")
//    void join(){
//        //given
//        User user = new User(1L, "UserA", "UserA@gmail.com","test001");
//
//        //when
//        userService.join(user);
//        User findUser = userService.findUser(1L);
//
//        //then
//        Assertions.assertThat(user).isEqualTo(findUser);
//
//    }
//
//    @Test
//    @DisplayName("회원 정보 수정 테스트")
//    void edit(){
//        //given
//        User user = new User(1L, "UserA", "UserA@gmail.com","test001");
//        User newUser = new User(1L, "ChangedA","UserA@gmail.com","test001");
//
//        userService.join(user);
//        User before = userService.findUser(1L);
//        System.out.println("before_name = " + before.getName() + " before_email = " + before.getEmail() + " before_password = " + before.getPassword());
//        userService.edit(newUser.getId(), newUser);
//        User after = userService.findUser(1L);
//        System.out.println("after_name = " + after.getName() + " after_email = " + after.getEmail() + " after_password = " + after.getPassword());
//
//        Assertions.assertThat(newUser).isEqualTo(after);
//    }
//
//    @Test
//    @DisplayName("회원 탈퇴 테스트")
//    void withDraw(){
//        User user = new User(1L, "UserA", "UserA@gmail.com","test001");
//        userService.join(user);
//        userService.withdraw(user.getId());
//        User after = userService.findUser(1L);
//        Assertions.assertThat(after).isNull();
//    }
//}
