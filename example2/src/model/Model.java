package model;

public class Model {
    private String name;
    private int hp;
    private int power;
    private int exp;

    public Model() {

    }

    public Model(String name) {
        setName(name);
    }

    public void attack(Mob monster) {
        System.out.println(this.name + " attack");
        System.out.println("몬스터의 속성 : " + monster.getName());
    }

    void run() {
        System.out.println(this.name + " run");
    }

    void sleep() {
        System.out.println("sleep");
    }

    private void die() {  // 클래스 안에서만 동작하므로 pubilc 안써도 됨. private이므로 외부에서 호출 불가능
        System.out.println(this.name + "가 사망하였습니다.");
        System.out.println("Game Over");
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setExp(int exp) {
        this.exp += exp;
    }

    public int getExp() {
        return this.exp;
    }

    public void damage(int damage) {
        this.hp -= damage;
        if(this.hp <= 0) {
            this.die();   // 객체 모두가 죽는게 아닌 해당 객체만 죽는 것
        }
    }
}
