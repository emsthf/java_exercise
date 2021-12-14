package model;

public class Worrier extends Model {
    // 필드
    private int power;

    // 생성자
    public Worrier() {
        System.out.println("전사가 생성되었습니다.");
    }

    // 메소드
    public void attack() {
        System.out.println("공격" + this.power);
    }

    // 게터, 세터
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
