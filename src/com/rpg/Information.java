package com.rpg;

import java.util.Scanner;

public class Information {
    Enemy enemy = new Enemy();
    Player player = new Player();
    Weapon weapon = new Weapon();
    Armor armor = new Armor();
    Scanner sc = new Scanner(System.in);
    int answer;
    int currAttack;
    int currDefence;
    int weaponStat;
    int armorStat;
    int gold;
    int potion;
    int statshop;


    public void status(){
        System.out.println("<-------------------------[Status "+player.getName()+"]-------------------------->");
        System.out.println("HP : "+player.hp+"\n" +
                "Level : "+player.currlvl+"\n" +
                "Exp : "+player.totalExp+"\n" +
                "Gold : "+ gold+"\n" +
                "Attack : "+player.att+" + "+weaponStat+"\n" +
                "Defence : "+player.def+" + "+armorStat+"\n" +
                "Potion : "+potion);
    }

    public void shopping(){
        statshop = 1;
        System.out.println("<-------------------------[Shop]-------------------------->");
        while (statshop == 1){
            System.out.println("Gold : "+gold);
            System.out.println("blacksmith : apa yang ingin kamu beli? \n" +
                    "1. Weapon \n" +
                    "2. Armor \n" +
                    "3. Potion \n" +
                    "4. Tidak Membeli");
            answer = sc.nextInt();
            if (answer == 1){
                System.out.println(player.getName()+" : aku mau beli Weapon \n" +
                        "blacksmith : silahkan pilih");
                int a = 1;
                for (int i = 0; i < 3; i++) {
                    System.out.println(a + ". " + weapon.name[i] +" [attack + "+weapon.attack[i] +"]"+"  harga : " + weapon.cost[i]);
                    a++;
                }
                answer = sc.nextInt();
                if (answer == 1 && gold >= weapon.cost[0]){
                    gold -= weapon.cost[0];
                    System.out.println("kamu membeli "+weapon.name[0]);
                    currAttack = player.att + weapon.attack[0];
                    weaponStat = weapon.attack[0];
                }
                else if (answer == 2 && gold >= weapon.cost[1]){
                    gold -= weapon.cost[1];
                    System.out.println("kamu membeli "+weapon.name[1]);
                    currAttack = player.att + weapon.attack[1];
                    weaponStat = weapon.attack[1];
                }
                else if (answer == 3 && gold >= weapon.cost[2]){
                    gold -= weapon.cost[2];
                    System.out.println("kamu membeli "+weapon.name[2]);
                    currAttack = player.att + weapon.attack[2];
                    weaponStat = weapon.attack[2];
                }
                else {
                    System.out.println("blacksmith : barang yang kamu cari tidak ada atau uangmu tidak cukup");
                }
            }
            else if (answer == 2){
                System.out.println(player.getName()+" : aku mau membeli Armor \n" +
                        "blacksmith : pilih yang mana?");
                int a = 1;
                for (int i = 0; i < 3; i++) {
                    System.out.println(a + ". " + armor.name[i] +" [defence + "+armor.defence[i] +"]"+"  harga : " +
                            armor.cost[i]);
                    a++;
                }
                answer =sc.nextInt();
                if (answer == 1 && gold >= armor.cost[0]){
                    gold -= armor.cost[0];
                    System.out.println("kamu membeli "+armor.name[0]);
                    currDefence = player.def + armor.defence[0];
                    armorStat = armor.defence[0];
                }
                else if (answer == 2 && gold >= armor.cost[1]){
                    gold -= armor.cost[1];
                    System.out.println("kamu membeli "+armor.name[1]);
                    currDefence = player.def + armor.defence[1];
                    armorStat = armor.defence[1];
                }
                else if (answer == 3 && gold >= armor.cost[2]){
                    gold -= armor.cost[2];
                    System.out.println("kamu membeli "+armor.name[2]);
                    currDefence = player.def + armor.defence[2];
                    armorStat = armor.defence[2];
                }
                else {
                    System.out.println("blacksmith : barang yang kamu cari tidak ada atau uangmu tidak cukup");
                }
            }
            else if (answer == 3 && gold >= 100){
                gold -= 100;
            }
            else if (answer == 4){
                statshop = 0;
            }
        }
    }
}