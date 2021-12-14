package model;

public class SuperWorrier extends Worrier {
    private boolean fly;

    public SuperWorrier() {
    }

    public SuperWorrier(boolean fly) {
        this.fly = fly;
    }

    public void flying() {
        System.out.println("날아갑니다.");
    }

    public void attack() {
        System.out.println("슈퍼 어택");
        super.attack();
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }
}
