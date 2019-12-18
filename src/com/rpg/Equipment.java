package com.rpg;

public abstract class Equipment{
    private int equipAttack;
    private int equipDefence;

    public Equipment(){
        equipAttack = 3;
        equipDefence = 3;
    }

    public int getEquipAttack() {
        return equipAttack;
    }

    public int getEquipDefence() {
        return equipDefence;
    }
}
