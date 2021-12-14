import create.MakeChar;
import model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("게임 시작!");
        System.out.println("직업을 선택하세요. 1/2");
        String select = sc.nextLine();
        System.out.println(MakeChar.makeModel(select).getName());
//        Model m = MakeChar.makeModel(select);

//        System.out.println(Integer.parseInt("20"));

        Monster[] mons = new Monster[10];
        for(int i=0; i< mons.length; i++) {
            mons[i] = new Monster();
        }
    }
}
