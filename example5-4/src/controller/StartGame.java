package controller;

import model.ModelCharacter;
import repository.ModelData;

import java.util.Scanner;

public class StartGame {
    public static String startGame() {
        System.out.println("게임을 시작합니다.");

        System.out.println("캐릭터를 선택하세요. 1 : Worrier, 2 : Wizard");
        Scanner sc = new Scanner(System.in);
        String select = sc.nextLine();

//        ModelCharacter wo = new Worrier("전사지롱");
//        ModelCharacter wi = new Wizzard("마법사지롱");
//        ModelCharacter w2 = new Wizzard("마법사면 좋겠지");
//        ModelData.modelList.put(wo.getName(),wo);
//        ModelData.modelList.put(wi.getName(),wi);
//        ModelData.modelList.put(w2.getName(),wi);
//        ModelData.getModel("전사지롱").setHp(100000);
//        System.out.println(ModelData.getModelList());
//        ModelData.getModel("마법사지롱").setLv(999);
//        System.out.println(ModelData.getModelList());

        ModelCharacter character = CreateCharacter.createCharacter(select);

        if(character == null) {
            startGame();
        } else {
            System.out.println("캐릭터의 이름을 입력하세요.");
            String characterName = sc.nextLine();
            character.setName(characterName);
            System.out.println("캐릭터의 이름은 " + character.getName() + "입니다.");
        }
        ModelData.modelList.put(character.getName(), character);   // DB에 저장
        System.out.println(ModelData.getModelList());
        String characterName = character.getName();
        return characterName;
    }
}
