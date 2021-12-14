package controller;
import model.Elf;
import model.Model;
import model.Wizard;
import model.Worrier;

import java.util.Scanner;

public class Starter {

    public static void start() {    // static을 사용해 만들어 진 셈 친다
        Scanner sc = new Scanner(System.in);
        System.out.println("게임을 시작합니다.");

        System.out.println("영웅을 선택하세요");
        System.out.println("1:전사 , 2:마법사 , 3:엘프");
        String select = sc.nextLine();
        Model m =CreateModel.createModel(select);

        if(m == null) {              // m이 null이면
            System.out.println("입력이 잘못되었습니다.");
            System.out.println();
            start();                 // 시작 메소드 다시 실행
        }
    }
}
