package model;

public class ModelCharacter {
    // 필드
    private String name;
    private int hp;

    // 생성자
    public ModelCharacter() {
        System.out.println("캐릭터가 생성되었습니다.");
        this.name = "디폴트 캐릭터";
    }

    public ModelCharacter(String name) {
        this.name = name;
    }

    // 게터세터

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
