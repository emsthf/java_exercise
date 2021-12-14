package controller;

import model.Elf;
import model.Model;
import model.Wizard;
import model.Worrier;

public class CreateModel {

    public static Model createModel(String select) {
        if(select.equals("1")) {
            Model m = new Worrier();
            return m;
        } else if(select.equals("2")) {
            Model m = new Wizard();
            return m;
        } else {
            Model m = new Elf();
            return m;
        }
    }
}
