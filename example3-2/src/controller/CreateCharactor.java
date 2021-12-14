package controller;

import model.Model;
import model.Wizard;
import model.Worrier;

public class CreateCharactor {

    public static Model createCharactor(String select) {
        if(select.equals("1")) {
            Model m = new Worrier();
            return m;
        } else if(select.equals("2")) {
            Model m = new Wizard();
            return m;
        } else {
            return null;
        }
    }
}
