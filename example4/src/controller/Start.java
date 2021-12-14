package controller;

import model.Model;
import model.Worrier;
import start.GameStartImpl;
import start.GameStater;

import java.util.Scanner;

public class Start {
    public static void starter() {
        Scanner sc = new Scanner(System.in);

        System.out.println("직업을 선택해주세요.");
        System.out.println("1:전사 , 2:마법사");
        String select = sc.nextLine();
        Model m = CreateCharactor.createCharactor(select);
        if(m == null) {
            System.out.println("잘못 입력하셨습니다.\n");
            starter();
        } else {
            GameStater gs = new GameStartImpl();
            gs.inputName(m, select);

        }
    }
}
