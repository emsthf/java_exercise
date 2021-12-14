package create;

import model.Model;
import model.Wizard;
import model.Worrior;

public class MakeChar {

    static Model selectedModel;

    public static Model makeModel(String type){
        if(type.equals("1")){
            Worrior worrior = new Worrior();
            System.out.println(worrior.getName()+"가 생성되었습니다.");
            return worrior;
        } else {
            Wizard wizard = new Wizard();
            System.out.println(wizard.getName()+"가 생성되었습니다.");
            return wizard;
        }
    }
}