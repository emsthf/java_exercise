import create.Hero;
import create.Mob;
import create.Villain;

import java.util.Scanner;

public class Main {
    static void createHero(Hero h) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("캐릭터의 이름을 입력하세요.");
        String inputName = sc2.nextLine();
        h.setName(inputName);
        System.out.println("당신이 생성한 히어로는 \"" + h.callName() + "\" 입니다.\n");
    }

    public static void main(String[] args) {
        Mob monster1 = new Mob();
        Mob monster2 = new Mob("고블린");

        System.out.println("게임 시작");
        Scanner sc = new Scanner(System.in);

        Hero newbie = new Hero();
        Hero hawkEye = new Hero();
        createHero(newbie);
        createHero(hawkEye);

        System.out.println("몹을 만났습니다.\n명령을 선택하세요.");
        System.out.println("1 : 공격 , 2 : 도망");
        int num = sc.nextInt();
        if(num == 1) {
            newbie.attack(monster1);
            System.out.println();
            newbie.attack(monster2);
        } else if(num == 2) {
            newbie.run();
        } else {
            System.out.println("입력이 잘못 되었습니다.");
        }

        System.out.println();
        System.out.println("몹을 만났습니다.\n명령을 선택하세요.");
        System.out.println("1 : 공격 , 2 : 도망");
        int num2 = sc.nextInt();
        if(num2 == 1) {
            newbie.attack(monster1);
            System.out.println();
            newbie.attack(monster2);
        } else if(num2 == 2) {
            newbie.run();
        } else {
            System.out.println("입력이 잘못 되었습니다.");
        }


//        System.out.println();
//        System.out.println("악당을 생성합니다.");
//        System.out.println("악당 이름을 입력해주세요.");
//        String inputVname = sc.nextLine();
//
//        Villain monster = new Villain(inputVname);
//        System.out.println("당신이 생성한 악당은 \"" + monster.callVname() + "\" 입니다.");
    }
}
