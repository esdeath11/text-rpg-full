package com.rpg;

import java.util.Random;

public class BattleEvent extends Mission{
    Enemy enemy = new Enemy();
    boolean answerStatus = true;
    int enemyAtt;
    int chanceEsc;
    Random ran = new Random();

    public void battle(){
        System.out.println("<-------------------------------[BATTLE]------------------------------->");
        while (answerStatus == true){
            enemyAtt = enemy.att;
            System.out.println("<---------------[Status "+musuh+"]--------------->");
            System.out.println("HP musuh = "+enemy.hp);
            System.out.println("Att musuh = "+enemyAtt);
            System.out.println("Level musuh = "+enemy.currlvl);
            System.out.println();
            System.out.println("<---------------[Status "+player.getName()+"]--------------->");
            System.out.println("HP Player = "+player.hp);
            System.out.println("Att Player = "+currAttack);
            System.out.println("Potion = "+potion);
            System.out.println("Level Player = "+player.currlvl);
            System.out.println("Exp Player= "+ player.totalExp);
            System.out.println();
            System.out.println("<"+musuh+" Sedang mendekat!>");
            System.out.println("1. Serang"+"\n"+"2. Bertahan"+"\n"+"3. Healing"+"\n"+"4. istirahat"+"\n"+"5. kabur");
            System.out.println("<---------------[Answer]--------------->");
            answer = sc.nextInt();
            if (answer == 1){
                System.out.println("<-------["+player.getName()+" Menyerang]------->");
                enemy.hp = enemy.hp - currAttack;
                System.out.println("Kamu Menyerang "+musuh);
                System.out.println(musuh+" menerima "+currAttack+" Damage!!");
                if (enemy.hp < 1){
                    System.out.println("<----[KAMU MENANG!!!]---->");
                    player.setExperience(dropExp);
                    System.out.println("<----[kamu mendapat "+dropExp+" EXP!!!]---->");
                    gold = gold + dropGold;
                    System.out.println("<----[kamu mendapat "+dropGold+" Gold!!!]---->");
                    player.setStatus();
                    break;
                }
                else if (enemy.hp > 0){
                    enemyAttack();
                }
            }
            else if(answer == 2){
                System.out.println(player.getName()+" : Use Potion");
                if (player.hp < player.maxHp){
                    potion -= 1;
                    player.hp += 20;
                    System.out.println("HP player + "+ 20);
                }
                else{
                    System.out.println("HP mu masih penuh!!!");
                }
            }
            else if(answer == 3){
                System.out.println("Escape!!");
                chanceEsc = ran.nextInt(2);
                if (chanceEsc == 1){
                    System.out.println("kamu berhasil kabur");
                    answerStatus = false;
                    break;
                }
                else {
                    enemyAttack();
                }
            }
        }
    }

    public void enemyAttack(){
        System.out.println("<-------["+musuh+" Menyerang]------->");
        player.hp = (player.hp + currDefence) - enemyAtt ;
        System.out.println("kamu terkena "+(enemyAtt - currDefence)+" DAMAGE!!!");
        if (player.hp  < 1){
            System.out.println("GAME OVER");
            System.exit(1);
        }
        else if (player.hp > 0){
            battle();
        }
    }
}
