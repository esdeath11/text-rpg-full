package com.rpg;

public class Mission extends Information{

    private String enemyName[] = enemy.getEnemyName();
    private int enemyDropExp[] = enemy.getDropExp();

    private String Quest[] = {"Operation Blue Thunder",
            "Operation Battle Axe",
            "Operation Minerva",
            "Operation Jack The Ripper"};

    public String[] getQuest() {
        return Quest;
    }

    public void blue(){
        System.out.println("<----------------------------------[Operation Blue Thunder]---------------------------------->");
        System.out.println("Target : "+enemyName[1]);
        System.out.println("Location = Quiet Forest");
        System.out.println("<----------------------------------[Before Battle]---------------------------------->");
        System.out.println(enemyName[1]+" : Hahaha kamu tidak bisa mengalahkanku!!!");
        System.out.println(player.getName()+" : Yakin? Mau di coba dulu?");
        System.out.println(enemyName[1]+" : hmmm... ayo kita bertarung");
        System.out.println(player.getName()+" : siapa tajut");
        enemy.setExperience(300);
        enemy.setStatus();
        musuh = enemyName[1];
        dropExp = enemyDropExp[1];
        dropGold = 250;
    }

    public void axe(){
        System.out.println("<----------------------------------[Operation Blue Thunder]---------------------------------->");
        System.out.println("Target : "+enemyName[2]);
        System.out.println("Location = Quiet Forest");
        System.out.println("<----------------------------------[Before Battle]---------------------------------->");
        System.out.println(enemyName[2]+" : Hahaha kamu tidak bisa mengalahkanku!!!");
        System.out.println(player.getName()+" : Yakin? Mau di coba dulu?");
        System.out.println(enemyName[2]+" : hmmm... ayo kita bertarung");
        System.out.println(player.getName()+" : siapa tajut");
        enemy.setExperience(400);
        enemy.setStatus();
        musuh = enemyName[2];
        dropExp = enemyDropExp[2];
        dropGold = 573;
    }

    public void minerva(){
        System.out.println("<----------------------------------[Operation Blue Thunder]---------------------------------->");
        System.out.println("Target : "+enemyName[3]);
        System.out.println("Location = Quiet Forest");
        System.out.println("<----------------------------------[Before Battle]---------------------------------->");
        System.out.println(enemyName[3]+" : Hahaha kamu tidak bisa mengalahkanku!!!");
        System.out.println(player.getName()+" : Yakin? Mau di coba dulu?");
        System.out.println(enemyName[3]+" : hmmm... ayo kita bertarung");
        System.out.println(player.getName()+" : siapa tajut");
        enemy.setExperience(700);
        enemy.setStatus();
        musuh = enemyName[3];
        dropExp = enemyDropExp[3];
        dropGold = 850;

    }

    public void jack(){
        System.out.println("<----------------------------------[Operation Blue Thunder]---------------------------------->");
        System.out.println("Target : "+enemyName[4]);
        System.out.println("Location = Quiet Forest");
        System.out.println("<----------------------------------[Before Battle]---------------------------------->");
        System.out.println(enemyName[4]+" : Hahaha kamu tidak bisa mengalahkanku!!!");
        System.out.println(player.getName()+" : Yakin? Mau di coba dulu?");
        System.out.println(enemyName[4]+" : hmmm... ayo kita bertarung");
        System.out.println(player.getName()+" : siapa tajut");
        enemy.setExperience(1200);
        enemy.setStatus();
        musuh = enemyName[4];
        dropExp = enemyDropExp[4];
        dropGold = 3000;

    }
}
