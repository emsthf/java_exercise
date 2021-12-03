package model;

public class Worrior extends Model {
    int power;

    public Worrior() {
        setName("전사");
    }

    public Worrior(String name) {
        setName(name);
        setHp(100);
        setPower(3);
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

}
