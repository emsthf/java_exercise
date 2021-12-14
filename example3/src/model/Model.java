package model;

public class Model {
    private String name;
    private int hp;
    private int lv;

    public Model() {
    }

    public Model(String name) {
        this.name = name;
    }

    public Model(int hp) {
        this.hp = hp;
    }

    public Model(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Model(int hp, int lv) {
        this.hp = hp;
        this.lv = lv;
    }

    public Model(String name, int hp, int lv) {
        this.name = name;
        this.hp = hp;
        this.lv = lv;
    }

    // 메소드
    public void attack() {
        System.out.println("공격");
    }
    //

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
