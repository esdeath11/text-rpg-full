package com.rpg;

import java.util.Random;

public class BattleEvent extends Mission{

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
            System.out.println("1. Serang"+"\n"+"2. Use Potion"+"\n"+"3. Escape");
            System.out.println("<---------------[Answer]--------------->");
            answer = sc.nextInt();
            if (answer == 1){ //ScreenShot
                System.out.println("<-------["+player.getName()+" Menyerang]------->");
                currAttack = ran.nextInt(currAttack) + player.minAtt; // sudah memakai random
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
                    answerStatus = false;
                    break;
                }
                else if (enemy.hp > 0){
                    enemyAttack();
                }
            }
            else if(answer == 2){
                if (potion > 0){
                    System.out.println(player.getName()+" : Use Potion");
                    if (player.hp < player.maxHp){
                        potion -= 1;
                        player.hp += 20;
                        if (player.hp > player.maxHp){
                            player.hp = player.hp - (player.hp - player.maxHp);
                            System.out.println("HP player Max!!! ");
                        }
                        else {
                            System.out.println("HP player + "+ 20);
                        }
                    }
                    else {
                        System.out.println("HP masih penuh!!!");
                    }
                    enemyAttack();
                }
                else {
                    System.out.println("kamu tidak punya potion!!!");
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

    //Screen Shot
    public void enemyAttack(){
        System.out.println("<-------["+musuh+" Menyerang]------->");
        enemyAtt = ran.nextInt(enemyAtt) + enemy.minAtt;
        player.hp = (player.hp + currDefence) - enemyAtt ; // sudah memakai random
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
