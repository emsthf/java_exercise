package view;

import controller.GameBattle;

public class StoryImpl implements Story {
    @Override
    public String selectStage(String name) {
//
        return null;
    }

    @Override
    public void levelUp(String name) {
//        LvUp.lvUp(name);
    }

    @Override
    public void battle() {
        GameBattle.gameBattle();
    }
}
