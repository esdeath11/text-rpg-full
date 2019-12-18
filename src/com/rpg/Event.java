package com.rpg;

import java.util.Scanner;

public class Event extends BattleEvent{
    int statidle;
    int statshop;
    int answer;
    int weaponStat;
    int armorStat;
    int currAttack;
    int currDefence;
    int potion;
    String quest[] = getQuest();
    Scanner sc = new Scanner(System.in);
    Player player = new Player();
    Weapon weapon = new Weapon();
    Armor armor = new Armor();
    public void starting(){
        gold = 300;
        potion = 2;
        intro();
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
            }
            if (answer == 2){
                shopping();
            }
            if (answer == 3){
                status();
            }
        }
    }

    public void mission(){
        int a = 1;
        for (int i = 0; i < 4; i++) {
            System.out.println(a+" : "+ quest[i]);
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
            axe();
            battle();
        }
        else if (answer == 4){
            axe();
            battle();
        }
    }
}
