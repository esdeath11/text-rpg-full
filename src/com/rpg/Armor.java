package com.rpg;

public class Armor extends Equipment {
    int cost[]={300,500,1000};
    String name[]={"Normal Armor","Rare Armor","Unique Armor"};
    int defence[]={getEquipDefence()+3,getEquipDefence()+5,getEquipDefence()+12};
}