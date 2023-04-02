package org.example;

import unit.Names;

import java.util.Random;

public abstract class BaseHero implements GameInterface {
    public String name;
    protected String class_name;

    protected int x;
    protected int y;

    protected int hp;
    protected int max_hp;

    protected int armor;
    protected int[] damage;
    protected int atak;


    @Override
    public String toString() {
        return name + " " + hp + " " + armor + " " + class_name;
    }

    public BaseHero(int hp, int x, int y, int armor, int atak, int[] damage, String class_name){
        this.name = getName();
        this.hp = hp;
        this.name = name;
        this.x = x;
        this.atak = atak;
        this.y = y;
        this.armor = armor;
        this.damage = damage;
        this.class_name = class_name;
    }
   @Override
   public String getInfo(){
        return "";
   }
   public String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();

   }


    protected int getInt(){
        return 1;
    }
}

