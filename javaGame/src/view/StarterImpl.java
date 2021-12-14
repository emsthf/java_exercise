package view;

import controller.CreateCharacter;
import controller.StartGame;

public class StarterImpl implements Starter{
    @Override
    public void starter() {
        StartGame.startGame();
    }

    @Override
    public void charSelector() {
        CreateCharacter.createCharacter(StartGame.charSelector(), StartGame.inputUserName());
    }
}
