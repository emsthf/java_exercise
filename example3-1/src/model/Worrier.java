package model;

public class Worrier extends Model {
    private int power;

    public Worrier() {
        System.out.println("전사가 생성되었습니다.");
        setPower(5);
    }

    public Worrier(int power) {
        this.power = power;
    }

    public void attack(){
        System.out.println(this.power + "만큼 물리공격");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
