package model;

public class SuperSuperWorrier extends SuperWorrier {
    boolean kick;

    public SuperSuperWorrier() {
    }

    public SuperSuperWorrier(boolean kick) {
        this.kick = kick;
    }

    public void attack() {
        System.out.println("슈퍼 슈퍼 어택");
    }

    public void superKick() {
        System.out.println("슈퍼 킥");
    }

    public boolean isKick() {
        return kick;
    }

    public void setKick(boolean kick) {
        this.kick = kick;
    }
}
