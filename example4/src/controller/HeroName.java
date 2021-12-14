package controller;

import model.Model;
import model.Wizard;
import model.Worrier;

import java.util.Scanner;

public class HeroName {
    public static void heroName(Model model, String select) {
        Scanner sc = new Scanner(System.in);

        System.out.println("전사의 이름은?");
        String name = sc.nextLine();
        model.setName(name);
        System.out.println("영웅의 이름은 " + model.getName() + " 입니다");
//        if(select.equals("1")) {
//            Worrier worrier = (Worrier) model;
//            System.out.println("전사의 이름은?");
//            String name = sc.nextLine();
//            worrier.setName(name);
//            System.out.println("전사의 이름은 " + worrier.getName() + " 입니다");
//            Model m = worrier;
//        } else {
//            Wizard wizard = (Wizard) model;
//            System.out.println("마법사의 이름은?");
//            String name = sc.nextLine();
//            wizard.setName(name);
//            System.out.println("마법사의 이름은 " + wizard.getName() + " 입니다");
//            Model m = wizard;
//        }
    }
}
