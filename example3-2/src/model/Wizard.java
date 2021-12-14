package model;

public class Wizard extends Model {
    // 필드
    private int spellPower;

    // 생성자
    public Wizard() {
        System.out.println("마법사가 생성되었습니다.");
    }

    //메소드
    public void attack() {
        System.out.println("마법공격" + this.spellPower);
    }

    // 게터, 세터
    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }
}
