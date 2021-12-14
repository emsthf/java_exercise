package model;

public class ModelCharacter {
    private String name;
    private int hp;
    private int lv;
    private int exp;

    public ModelCharacter(){
        System.out.println("캐릭터가 생성 되었습니다.");
        this.name="디폴트 캐릭터";
        setHp(100);
        setLv(1);
        setExp(0);
    }

    public ModelCharacter(String name){
        setName(name);
    }


    public String toString(){
        return "캐릭터(이름:"+this.name+"hp:"+this.hp+"lv:"+this.lv+"경험치:"+this.exp+")";
    }


    public ModelCharacter(String name, int hp, int lv, int exp) {
        this.name = name;
        this.hp = hp;
        this.lv = lv;
        this.exp = exp;
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

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
