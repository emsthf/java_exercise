package model;

public class Hero {
    static String name;
    int hp;
    int mp;
    int lv;
    int exp;

    public Hero(String name) {
        setName(name);
    }

    public Hero() {

    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public void attack() {
        System.out.println(this.name + " attack");
    }

    void run() {
        System.out.println("run");
    }

    void sleep() {
        System.out.println("sleep");
    }
}
