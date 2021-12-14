package controller;

import fight.Fight;
import fight.FightImpl;
import model.Model;

import java.util.Scanner;

public class Starter {

    public static void starter() {
        System.out.println("Start Game");
        System.out.println("Select Charactor 1:Worrier , 2:Wizard");
        Scanner sc = new Scanner(System.in);
        String select = sc.nextLine();
        Model m = CreateCharactor.createCharactor(select);
        if(m == null) {
            System.out.println("잘못 입력하셨습니다.");
            starter();     // 내가 나를 부르는 코드는 엄청나게 위험한 코드. 이런 무한 반복이 될 수 있는 코드는 매크로를 돌리게 되면 바로 서버 죽음
        } else {
            Fight fi = new FightImpl();
            fi.startFight(m, select);
        }
    }
}
