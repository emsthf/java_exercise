package controller;

import model.Mob;
import repository.ModelData;

import java.util.Scanner;

public class SettingStageLv {
    public static String settingStageLv(String name) {
        ModelData.modelList.get(name);
        System.out.println("게임의 Level를 선택해주세요. 1 : 초급, 2 : 고급");
        Scanner sc = new Scanner(System.in);
        String selectLv = sc.nextLine();
        String mobName = SelectStageLv.selectStageLv(name, selectLv);
        if(mobName == null) {
            settingStageLv(name);
        } else {
            System.out.println("레벨 선택 완료");
        }
//        ModelData.modelList.put(mob.getName(), mob);
        return mobName;
    }
}
