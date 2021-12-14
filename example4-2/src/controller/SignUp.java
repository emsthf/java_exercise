package controller;

import user.User;

import java.util.Scanner;

public class SignUp {
    public static User signUp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = sc.nextLine();
        System.out.println("id를 입력하세요.");
        String userId = sc.nextLine();
        System.out.println("패스워드를 입력하세요.");
        String password = sc.nextLine();
        System.out.println("전화번호를 입력하세요.");
        String phoneNumber = sc.nextLine();
        System.out.println("이메일을 입력하세요.");
        String email = sc.nextLine();

        User user = new User(name, userId, password, phoneNumber, email);
        return user;

    }
}
