package model;

public class Elf extends Model {
    private int dex;

    public Elf() {
        System.out.println("엘프가 생성되었습니다.");
    }

    public Elf(int dex) {
        this.dex = dex;
    }

    public void attack() {
        System.out.println(this.dex + "만큼 원거리 공격");
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }
}
