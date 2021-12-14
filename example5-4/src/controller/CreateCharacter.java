package controller;

import model.ModelCharacter;
import model.Wizzard;
import model.Worrier;

public class CreateCharacter {
    public static ModelCharacter createCharacter(String select) {
        ModelCharacter model;
        if(select.equals("1")) {
            model = new Worrier();
        } else if(select.equals("2")) {
            model = new Wizzard();
        } else {
            System.out.println("잘못 선택하셨습니다.");
            return null;
        }
        return model;
    }
}
