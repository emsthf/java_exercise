package controller;

import model.Mob;

public class CreateMonster {
    public static Mob createMonster(){
        String[] mobName = {"도깨비", "그건바로너", "빌런은 나"};

        int randomNumber = (int)(Math.random()*3);
        int hp = (int)(Math.random()*100)+1;
        int getExp = (int)(Math.random()*10)+1;
        int attackPt = (int)(Math.random()*10)+1;
        System.out.println(randomNumber);
        Mob mob = new Mob(mobName[randomNumber], hp,getExp,attackPt);
        return mob;
    }
}
