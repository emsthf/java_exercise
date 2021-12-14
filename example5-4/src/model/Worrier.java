package model;

public class Worrier extends ModelCharacter{

    private int power;


    public Worrier(int power) {
        this.power = power;
    }

    public Worrier(String name){
        setName(name);
    }

    public Worrier() {
        setPower(10);
        System.out.println("전사 생성");
    }

//    public Worrier(String name, int hp, int lv, int exp, int power) {
//        super(name, hp, lv, exp);
//        this.power = power;
//    }



    //getter, setter
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
