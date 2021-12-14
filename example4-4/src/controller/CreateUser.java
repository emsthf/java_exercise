package controller;

import model.UserModel;

public class CreateUser {
    public static UserModel createUser(String name, String userId, String password, String phoneNumber, String email) {  // 보통 클래스와 동일한 이름의 메소드로 만듦
        // CreateUser 클래스의 createUser 메소드는
        UserModel user = new UserModel(name, userId, password, phoneNumber, email);   // 요소 값들을 받아오는 UserModel을 생성
        return user;   // 요소 값을 받아와 생성한 UserModel을 반환
    }
}
