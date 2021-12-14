package start;

import controller.Starter;

public class GameStarterImpl implements GameStarter {
    @Override
    public void gameStarter() {
        Starter.starter();
    }
}
