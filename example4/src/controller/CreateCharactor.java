package controller;

import model.Model;
import model.Wizard;
import model.Worrier;

public class CreateCharactor {
    public static Model createCharactor(String select) {
        if(select.equals("1")) {
            Model model = new Worrier();
            return model;
        } else if(select.equals("2")) {
            Model model = new Wizard();
            return model;
        } else {
            return null;
        }
    }
}
