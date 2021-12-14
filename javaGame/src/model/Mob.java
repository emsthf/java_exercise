package model;

public class Mob {

    private String name;
    private int hp=30;
    private int getExp=100;
    private int attackPt=20;
//    private int hp;
//    private int getExp;
//    private int attackPt;



    public Mob(){
        System.out.println("몹 생성");
        setName("몹몹이");
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

    public String toString(){
        return "몬스터 이름: " + this.name + " hp : " + this.hp + " : 경험치 " + this.getExp;
    }

    public void damage(int attackPt){
        System.out.println(attackPt + "만큼의 공격을 받았습니다.");
        this.hp -= attackPt;
        System.out.println("현재 HP : " + getHp());
        if(this.hp <= 0) {
            this.die();
        }
    }

    public void die(){
        System.out.println("Mob이 죽었습니다.");
    }




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
