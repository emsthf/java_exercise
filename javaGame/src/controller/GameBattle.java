package controller;

import repository.ModelRepo;
import repository.ModelRepoImple;
import repository.UserData;

public class GameBattle {
    public static void gameBattle(){
        ModelRepo mr = new ModelRepoImple();
        mr.getterModel(UserData.getUserName()).attack(CreateMonster.createMonster());
    }
}
