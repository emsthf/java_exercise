package model;

public class Wizard extends Model {
    int mp;
    int spPower;

    public Wizard() {
        setName("마법사");
    }

    public Wizard(String name) {
        setName(name);
        setHp(50);
        setMp(50);
        setSpPower(3);
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMp() {
        return this.mp;
    }

    public void setSpPower(int spPower) {
        this.spPower = spPower;
    }

    public int getSpPower() {
        return this.spPower;
    }
}
