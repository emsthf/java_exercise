package controller;

import viewer.SignUp;
import viewer.SignUpImple;

import java.util.Scanner;

public class SetUserForm {
    public static void inputData() {   // 회원가입에 필요한 데이터를 입력받는 메소드
        Scanner sc = new Scanner(System.in);

        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("UserId : ");
        String userId = sc.nextLine();
        System.out.print("Password : ");
        String password = sc.nextLine();
        System.out.print("Phone : ");
        String phoneNumber = sc.nextLine();
        System.out.print("Email : ");
        String email = sc.nextLine();

        SignUp su = new SignUpImple();   // 인터페이스를 생성하고
        su.signUp(name,userId,password,phoneNumber,email);
    }
}
