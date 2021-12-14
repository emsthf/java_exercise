package gameStarter;

import controller.Starter;
import controller.StarterV2;
import modelRepository.ModelReoisitory;
import modelRepository.ModelRepositoryImpl;

public class GameStarterImpl implements GameStarter {
    @Override
    public void gameStarter() {
        Starter.starter();
//        StarterV2.starter();
    }

    @Override
    public void createCharacter() {
        ModelReoisitory mr = new ModelRepositoryImpl();
        mr.modelAdd();
    }
}
