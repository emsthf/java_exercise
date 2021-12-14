package repository;


import model.Mob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MobData {
    public static List<Mob> mobs = new ArrayList<Mob>();
    public static Map<String, Mob> mobList = new HashMap<String, Mob>();

    public static List<Mob> getMobs() {
        return mobs;
    }

    public static void setMobs(List<Mob> mobs) {
        MobData.mobs = mobs;
    }

    public static Map<String, Mob> getMobList() {
        return mobList;
    }

    public static void setMobList(Map<String, Mob> mobList) {
        MobData.mobList = mobList;
    }

    public static Mob getMob(String name) {
        return MobData.mobList.get(name);
    }
}
