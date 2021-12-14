package controller;

import java.util.Scanner;

public class StartGame {
    public static void startGame() {
        System.out.println("게임을 시작합니다.");

    }

    public static String charSelector(){
        System.out.println("캐릭터를 선택하세요. 1 : Worrior, 2 : Wizard");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String inputUserName(){

        System.out.println("캐릭터의 이름을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
