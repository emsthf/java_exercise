package model;

public class Wizzard extends ModelCharacter{

    private int spellPower;

    public Wizzard(){
        setSpellPower(12);
        System.out.println("마법사 생성");
    }

    public Wizzard(String name){
        setName(name);
    }


    public Wizzard(int spellPower) {
        this.spellPower = spellPower;
    }



    //getter, setter
    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }
}
