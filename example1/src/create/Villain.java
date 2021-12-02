package create;

public class Villain {
    String name;
    int hp;
    int mp;
    int lv;
    int exp;

    public Villain(String name) {
        setVname(name);
        this.hp = 120;
        this.mp = 50;
        this.lv = 1;
        this.exp = 0;
    }

    public Villain() {
        this.name = "Villain";
        this.hp = 120;
        this.mp = 50;
        this.lv = 1;
        this.exp = 0;
    }

    void setVname(String name) {
        this.name = name;
    }

    public String callVname() {
        return this.name;
    }
}
