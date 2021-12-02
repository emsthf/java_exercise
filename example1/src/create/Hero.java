package create;

public class Hero {
    Sword sword = new Sword();
    String name;
    int hp;
    int mp;
    int lv;
    int exp;

    public Hero(String name) {
        setName(name);
        this.hp = 100;
        this.mp = 50;
        this.lv = 1;
        this.exp = 0;
    }

    public Hero() {
        this.name = "Hero";
        this.hp = 100;
        this.mp = 50;
        this.lv = 1;
        this.exp = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    void getExp(int exp) {
        this.exp += exp;
        System.out.println(exp + "만큼 경험치가 상승했습니다!");
    }

    public String callName() {
        return this.name;
    }

    void getItem(Sword sword) {
        this.sword = sword;
        System.out.println(this.sword.name + "을/를 획득했습니다.");
    }

    public void attack(Mob mob) {
        System.out.println("몹의 속성 : " + mob.name + " lv." + mob.lv + " Hp" + mob.hp);
        System.out.println("\"" + sword.name + "\"으로 " + mob.name + "을/를 공격합니다.");
        System.out.println(sword.damage + " power");
        mob.getDamage(sword.damage);
        System.out.println(mob.name + "의 Hp : " + mob.hp);
        if(mob.hp <= 0) {
            mob.die();
            if(mob.name == "고블린") {
                Sword masterSword = new Sword("Sky Sword");
                getItem(masterSword);
            }
            getExp(mob.getExp);
        }
    }

    public void run() {
        System.out.println("run True");
    }
}
