package view;

import controller.StartGame;

public class StarterImpl implements Starter{
    @Override
    public String starter() {
        String name = StartGame.startGame();
        return name;
    }
}
