package model;

public class Mob {
    // field
    private String name;
    private int hp;
    private int power;

    // constructor
    public Mob() {
    }

    public Mob(String name) {
        this.name = name;
    }

    //method

    // getter, setter
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
