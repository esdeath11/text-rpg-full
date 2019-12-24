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
    int minAtt;
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
        exp = getExperience();
        totalExp += exp;
        maxHp = getHealthPoint();
        att = getAttack();
        def = getDefence();
        heal = getHealing();
        gainLevel();
    }

    //screenshot
    void gainLevel(){  //hp tidak full ketika naik level dan pemberian min attack
        while (totalExp > 99){
            totalExp -= 100;
            currlvl = currlvl + 1;
        }

        maxHp = maxHp + (10*currlvl);
        att += (3*currlvl);
        def += (1*currlvl);
        heal += (7*currlvl);
        minAtt += ((1*currlvl) + 2);
    }

}
