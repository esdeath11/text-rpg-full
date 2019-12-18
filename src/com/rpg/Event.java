package com.rpg;

import java.util.Scanner;

public class Event extends BattleEvent{
    String quest[] = getQuest();

    public void starting(){
        gold = 300;
        potion = 2;
        player.setExperience(100);
        player.setStatus();
        statusGain();
        intro();
    }




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

    public void intro(){
        System.out.println("<----------------[Intro]---------------->");
        System.out.println("Penjaga : Selamat datang di kota Antovers, kalau boleh tau siapa namamu?");
        System.out.println("??? : Namaku Adalah .....");
        System.out.println("<--[Answer]-->");
        player.setName(sc.nextLine());
        System.out.println(player.getName() + " : " + "Namaku adalah " + player.getName());
        System.out.println("Penjaga : Hai " + player.getName() + " senang bertemu denganmu, Apa yang ingin kamu lakukan di kota ini?");
        System.out.println(player.getName() + " : aku mau mendaftar ke guild, untuk berpetualang.");
        System.out.println("Penjaga : hmm...kalau begitu jalan lurus terus belok ke kanan.");
        System.out.println(player.getName() + " : Terimakasih Pak");
        System.out.println("<-------------------------[Intro Guild]-------------------------->");
        System.out.println("Guild Reseptionis : selamat datang di Elastas Guild, ada yang bisa saya bantu?");
        System.out.println(player.getName() + " : saya mau mendaftar sebagai petualang");
        System.out.println("Guild Reseptionis : kalau boleh tau siapa nama anda?");
        System.out.println(player.getName() + " : " + player.getName());
        System.out.println("Guild Reseptionis : silahkan tanda tangan disini");
        System.out.println(player.getName() + " : baik");
        System.out.println("Guild Reseptionis : baiklah anda sudah terdatar, selamat berburu");
        System.out.println(player.getName() + " : terimakasih");
        idle();
    }



    public void idle(){
        statidle = 1;
        while (statidle == 1){
            System.out.println("<-------------------------[Lobby]-------------------------->");
            System.out.println("Guild Reseptionis : apa yang ingin kamu lakukan? \n" +
                    "1. Mission \n" +
                    "2. Shop \n" +
                    "3. Check Status");
            answer = sc.nextInt();
            if (answer == 1){
                mission();
                statusGain();
                enemy.currlvl = 0;
            }
            if (answer == 2){
                shopping();
                statusGain();
            }
            if (answer == 3){
                status();
            }
        }
    }

    public void mission(){
        answerStatus = true;
        int a = 1;
        for (int i = 0; i < 4; i++) {
            System.out.println(a+" : "+ quest[i]);
            a++;
        }
        answer = sc.nextInt();
        if (answer == 1){
            blue();
            battle();
        }
        else if (answer == 2){
            axe();
            battle();
        }
        else if (answer == 3){
            minerva();
            battle();
        }
        else if (answer == 4){
            jack();
            battle();
        }
    }
}
