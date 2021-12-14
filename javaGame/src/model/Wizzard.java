package model;

public class Wizzard extends ModelCharacter{

    private int spellPower;

    public Wizzard(String name) {
        setName(name);
    }

    public Wizzard(){
        setSpellPower(12);
        System.out.println("Wizzard 생성");
    }


    //gettersetter
    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }
}
