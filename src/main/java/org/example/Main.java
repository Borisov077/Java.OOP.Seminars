package org.example;

import unit.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes = new ArrayList<>();
        ArrayList<BaseHero> randomHeroes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    heroes.add(new Arbalet("Арбакл"));
                    break;
                case 1:
                    heroes.add(new Mag("Властилин"));
                    break;
                case 2:
                    heroes.add(new Peasant("Крест"));
                    break;
                case 3:
                    heroes.add(new SpearMan("Копейщик"));
                    break;
                case 4:
                    heroes.add(new Monk("Монах"));
                    break;
                case 5:
                    heroes.add(new Thief("Вор"));
                    break;
                default:
                    heroes.add(new Snaiper("Снайпер"));
                    break;
            }

        }
        heroes.forEach(n -> System.out.println(n.name +" "+ n.getInfo()));
        SpellBook.ressurect.getPower();
        SpellBook.ressurect.getCost();
    }

}

