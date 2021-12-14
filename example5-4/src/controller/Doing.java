package controller;

import repository.MobData;
import repository.ModelData;

import java.util.Scanner;

public class Doing {
    public static void doing(String name, String mobName) {
        Scanner sc = new Scanner(System.in);

        System.out.println( MobData.mobList.get(mobName).getName() + "과 만났습니다." );

        while (ModelData.modelList.get(name).getHp() > 0 && MobData.mobList.get(mobName).getHp() > 0) {
            System.out.println("**전사의 턴**");
            System.out.println("행동을 선택하세요.");
            System.out.println("1:공격 , 2:도망");
            String selectDoing = sc.nextLine();

            if(selectDoing.equals("1")) {
                Attack.attack(name, mobName);

            } else if(selectDoing.equals("2")) {
                System.out.println("도망쳤습니다.");
                SettingStageLv.settingStageLv(name);
            } else {
                System.out.println("잘못 선택하셨습니다.");
            }
        }


    }
}
