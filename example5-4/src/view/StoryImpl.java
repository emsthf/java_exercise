package view;

import controller.Doing;
import controller.SettingStageLv;

public class StoryImpl implements Story {
    @Override
    public String selectStage(String name) {
        String mobName = SettingStageLv.settingStageLv(name);
        return mobName;
    }

    @Override
    public void battle(String name, String mobName) {
        Doing.doing(name, mobName);
    }

    @Override
    public void endGame() {

    }
}
