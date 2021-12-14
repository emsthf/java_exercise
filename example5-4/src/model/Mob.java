package model;

public class Mob {

    private String name;
    private int hp;
    private int getExp;
    private int attackPt;

    public Mob(){
        System.out.println("몹 생성");
    }

    public Mob(String name) {
        this.name = name;
    }

    public Mob(int hp, int getExp) {
        this.hp = hp;
        this.getExp = getExp;
    }

    public Mob(String name, int hp, int getExp, int attackPt) {
        this.name = name;
        this.hp = hp;
        this.getExp = getExp;
        this.attackPt= attackPt;
    }



    public void damage(){}

    public void die(){}




    //gettersetter

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

    public int getGetExp() {
        return getExp;
    }

    public void setGetExp(int getExp) {
        this.getExp = getExp;
    }

    public int getAttackPt() {
        return attackPt;
    }

    public void setAttackPt(int attackPt) {
        this.attackPt = attackPt;
    }

}
