package controller;

import model.Model;
import model.Wizard;
import model.Worrier;

public class SetFight {
    public static void setFight(Model model, String select) {

        if(select.equals("1")) {
            Worrier worrier = (Worrier) model;
            worrier.attack();
        } else if(select.equals("2")) {
            Wizard wizard = (Wizard) model;
        }
    }
}
