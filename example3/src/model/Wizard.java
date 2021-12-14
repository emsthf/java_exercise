package model;

public class Wizard extends Model {
    private int spellPower;
    private int mp;

    public Wizard() {
        System.out.println("마법사가 생성되었습니다.");
    }

    public Wizard(int spellPower) {
        this.spellPower = spellPower;
    }

    public void attack() {
        System.out.println(this.spellPower + "만큼 마법 공격");
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
