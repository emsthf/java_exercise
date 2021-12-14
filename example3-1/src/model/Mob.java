package model;

public class Mob {
    private String name;
    private int hp;

    public Mob() {
    }

    public Mob(String name) {
        this.name = name;
    }

    public Mob(int hp) {
        this.hp = hp;
    }

    public void getDamage(int power) {
        setHp(this.hp -= power);
    }

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
}
