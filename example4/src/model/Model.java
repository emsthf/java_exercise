package model;

public class Model {
    // field
    private String name;
    private int hp;
    private int lv;

    // constructor
    public Model() {
        System.out.println("모델 생성");
    }

    public Model(String name) {
        this.name = name;
    }

    //method
    public void attack() {
        System.out.println("모델 공격");
    }

    // getter, setter
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

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }
}
