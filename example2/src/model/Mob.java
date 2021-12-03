package model;

public class Mob {
    final static int lv = 1;
    static int count = 0;

    private String name;
    private int hp;

    public Mob() {

    }

    public Mob(String name) {
        setName(name);

    }

    public Mob(int hp) {
        setHp(hp);
    }

    public Mob(String name, int hp) {
        setName(name);
        setHp(hp);
    }

    public static void addCount() {
        count++;
        System.out.println(count);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }
}
