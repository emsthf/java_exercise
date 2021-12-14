package controller;

import model.ModelCharacter;

public class CreateCharacter {
    public static ModelCharacter createCharacter() {  // 단순히 모델캐릭터 객체를 생성만 하고 반환하는 클래스
        ModelCharacter mo = new ModelCharacter();  // 모델캐릭터 객체를 만들고
        return mo;  // 모델캐릭터 객체 반환
    }
}
