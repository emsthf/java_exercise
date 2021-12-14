package controller;

import model.Mob;
import model.Mob2;
import repository.MobData;
import repository.ModelData;

public class SelectStageLv {
    public static String selectStageLv(String name, String selectLv) {
        Mob mob;
        if(ModelData.modelList.get(name).getLv() == 1) {
            switch (selectLv) {
                case "1" :
                case "2" :
                    mob = new Mob();
                    MobData.mobList.put(mob.getName(), mob);
                    System.out.println("새로운 캐릭터는 1단계로 설정됩니다.");
                    break;
                default :
                    System.out.println("잘못 선택하셨습니다.");
                    return null;
            }
        } else {
            if(selectLv.equals("1")) {
                mob = new Mob();
                MobData.mobList.put(mob.getName(), mob);
                System.out.println("1단계로 설정되었습니다.");
            } else if(selectLv.equals("2")) {
                mob = new Mob2();
                MobData.mobList.put(mob.getName(), mob);
                System.out.println("2단계로 설정되었습니다.");
//                System.out.println(MobData.mobList.get(mob.getName()));
            } else {
                System.out.println("잘못 선택하셨습니다.");
                return null;
            }
        }
        return mob.getName();
    }
}
