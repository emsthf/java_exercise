package create;

public class Mob {
    public String name;
    public int hp;
    int lv;
    int getExp;
    int attackPt;

    public Mob() {
        this.name = "Monster";
        this.hp = 20;
        this.lv = 1;
        this.getExp = 10;
        this.attackPt = 1;
    }

    public Mob(String name) {
        this.name = name;
        this.hp = 20;
        this.lv = 1;
        this.getExp = 10;
        this.attackPt = 1;
    }

    public void getDamage(int attackPt) {
        this.hp -= attackPt;
    }

    void die() {
        System.out.println(this.name + "이/가 소멸되었습니다.");
    }
}
