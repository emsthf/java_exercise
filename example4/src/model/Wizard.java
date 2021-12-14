package model;

public class Wizard extends Model {
    // field
    private int spellPower;

    //constructor
    public Wizard() {
        System.out.println("마법사 생성");
        setSpellPower(10);
        setHp(100);
    }

    public Wizard(int spellPower) {
        this.spellPower = spellPower;
    }

    // method
    public void attack() {
        System.out.println(this.spellPower + " 마법사 공격");
    }

    // getter, setter
    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }
}
