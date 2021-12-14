package model;

public class Mob {
    // 필드
    private String name;
    private int hp;

    // 생성자
    public Mob() {
    }

    public Mob(String name) {
        this.name = name;
    }

    // 메소드 - 상관 관계가 복잡해지니 몹이 공격하는건 일단 빼자
    public void getDamage() {

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
