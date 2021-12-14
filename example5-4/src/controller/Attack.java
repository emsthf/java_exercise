package controller;

import model.*;
import repository.MobData;
import repository.ModelData;

import static repository.ModelData.getModel;

public class Attack {
    public static void attack(String name, String mobName) {
        if(ModelData.modelList.get(name) instanceof Worrier) {
            Worrier worrier = (Worrier) ModelData.modelList.get(name);   // 다운캐스팅 되나??
            System.out.println(worrier.getName() + "의 공격력 : " + worrier.getPower());
            System.out.println(MobData.mobList.get(mobName).getName() + " HP:" + MobData.mobList.get(mobName).getHp() + "공격력:" + MobData.mobList.get(mobName).getAttackPt());

            // 공격 할 때
            System.out.println(worrier.getPower() + "만큼 공격");
            System.out.println();



            // 공격 받을 때
            System.out.println();
            ModelData.modelList.get(name).setHp( ModelData.modelList.get(name).getHp() - MobData.mobList.get(mobName).getAttackPt() );

        } else {
            Wizzard wizzard = (Wizzard) ModelData.modelList.get(name);   // 다운캐스팅 되나??
            System.out.println(wizzard.getName() + "의 스펠파워 : " + wizzard.getSpellPower());
        }

    }
}
