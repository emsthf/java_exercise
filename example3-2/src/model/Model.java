package model;

public class Model {
    // 필드
    private String name;
    private int hp;

    public Model() {
        System.out.println("생성되었습니다");
    }

    public Model(String name) {
        this.name = name;
    }

    // 메소드
    public void attack() {
        System.out.println("공격");
    }

    public void run() {

    }

    public void die() {

    }

    // 게터, 세터
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
