package com.rpg;

public class Weapon extends Equipment{

    int cost[] = {300,500,1000};
    String name[] = {"Normal Sword","Rare Sword","Unique Sword"};
    int attack[] = {getEquipAttack()+2,getEquipAttack()+7,getEquipAttack()+10};



}
