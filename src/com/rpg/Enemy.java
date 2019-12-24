package com.rpg;

public class Enemy extends Human{
    int hp;
    int lvl;
    int totalExp;
    int att;
    int heal;
    int def;
    int exp;
    int currlvl;
    int minAtt;

    private String enemyName[] = {"Soldier", "Heliodora", "Aikaterine", "Protesilaus", "Scamandrius", "Eutychides"};
    private int dropExp[] = {70, 150, 250, 300, 400, 1000};

    public int[] getDropExp() {
        return dropExp;
    }

    public String[] getEnemyName() {
        return enemyName;
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
        lvl = getLevel();
        gainLevel();
    }

    void gainLevel(){ //pemberian minAttack
        while (totalExp > 99){
            totalExp -= 100;
            currlvl = currlvl + 1;
        }
        hp = hp + (10*currlvl);
        att += (3*currlvl);
        def += (1*currlvl);
        heal += (7*currlvl);
        minAtt += ((1*currlvl) + 2);
    }
}
