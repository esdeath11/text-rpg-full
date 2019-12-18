package com.rpg;

public abstract class Human implements Calculate{
    private String Name;
    private int HealthPoint;
    private int Attack;
    private int Defence;
    private int Experience;
    private int Level;
    private int Healing;
    private int Gold;

    public Human(){
        HealthPoint = 20;
        Attack = 4;
        Defence = 1;
        Experience = 0;
        Level = 1;
        Gold = 0;
        Healing = 10;
    }

    public int getHealing() {
        return Healing;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGold(int gold) {
        Gold = gold;
    }

    public String getName() {
        return Name;
    }

    public int getHealthPoint() {
        return HealthPoint;
    }

    public int getAttack() {
        return Attack;
    }

    public int getDefence() {
        return Defence;
    }

    public int getExperience() {
        return Experience;
    }

    public int getLevel() {
        return Level;
    }

    public int getGold() {
        return Gold;
    }

}
