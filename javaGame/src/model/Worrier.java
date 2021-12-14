package model;

public class Worrier extends ModelCharacter{

    private int power;

    public Worrier() {
        setPower(10);
        System.out.println("warrior 생성");
        setLv(2);
    }

    public Worrier(String name){
        setName(name);
    }

//    public Worrier(String name, int hp, int lv, int exp, int power) {
//        super(name, hp, lv, exp);
//        this.power = power;
//    }



    //gettersetter
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
