package com.rpg;

public class Player extends Human{
    int hp;
    int maxHp;
    int totalExp;
    int att;
    int heal;
    int def;
    int exp;
    int currlvl;
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setGold(int gold) {
        super.setGold(gold);
    }

    @Override
    public void setExperience(int experience) {
        super.setExperience(experience);
    }

    @Override
    public void setStatus() {
        hp = getHealthPoint();
        exp = getExperience();
        totalExp += exp;
        att = getAttack();
        def = getDefence();
        heal = getHealing();
        gainLevel();
    }

    void gainLevel(){
        while (totalExp > 99){
            totalExp -= 100;
            currlvl = currlvl + 1;
        }
        hp = hp + (10*currlvl);
        maxHp = hp + (10*currlvl);
        att += (3*currlvl);
        def += (1*currlvl);
        heal += (7*currlvl);
    }

}
