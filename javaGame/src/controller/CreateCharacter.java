package controller;

import model.Wizzard;
import model.Worrier;
import repository.ModelRepo;
import repository.ModelRepoImple;
import repository.UserData;

public class CreateCharacter {
    public static void createCharacter(String select, String name) {
        UserData.setUserName(name);

        ModelRepo mr = new ModelRepoImple();
        if(select.equals("1")){
            Worrier wo = new Worrier(name);
            mr.createModel(name, wo);
        } else if(select.equals("2")){
            Wizzard wi = new Wizzard(name);
            mr.createModel(name, wi);
        } else {
            System.out.println("입력값이 1도 아니고 2도 아니네요 꺼져요");
        }

    }
}
