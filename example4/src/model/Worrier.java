package model;

public class Worrier extends Model {
    // field
    private int power;

    // constuctor
    public Worrier() {
        System.out.println("전사 생성");
        setPower(10);
        setHp(100);
    }

    public Worrier(int power) {
        this.power = power;
    }

    // method
    public void attack() {
        System.out.println(this.power + " 전사 공격");
    }

    // getter, setter
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
