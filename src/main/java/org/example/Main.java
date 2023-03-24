package org.example;

import unit.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes = new ArrayList<>();
        heroes.add(new Arbalet("Арбакл"));
        heroes.add(new Mag("Властилин"));
        heroes.add(new Peasant("Крест"));
        heroes.add(new SpearMan("Копейщик"));
        heroes.add(new Monk("Монах"));
        heroes.add(new Thief("Вор"));
        heroes.add(new Snaiper("Снайпер"));

        heroes.forEach(n -> System.out.println(n));
    }
}

