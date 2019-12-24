package com.rpg;

import java.util.Scanner;

public class Information {
    int statidle;
    int answer;
    String musuh;
    int dropExp;
    int dropGold;


    boolean answerStatus;
    Scanner sc = new Scanner(System.in);
    Player player = new Player();
    Enemy enemy = new Enemy();
    Weapon weapon = new Weapon();
    Armor armor = new Armor();
    int currAttack;
    int currDefence;
    int weaponStat;
    int armorStat;
    int gold;
    int potion;
    int statshop;
    String cheat = "imthebestintheworld";

    public void statusGain(){
        currAttack = player.att + weaponStat;
        currDefence = player.def + armorStat;
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
                    player.minAtt += 3;
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
                potion += 1;
            }
            else if (answer == 4){
                statshop = 0;
            }
        }
    }
}
