package unit;

import org.example.BaseHero;

public class Peasant extends BaseHero {
    protected int arrows; // Количество стрел
    protected float backAmmo; // Скорость восстановления боеприпасов

    public Peasant(String name) {
        super(100, 4, 8, 90, 5, new int[]{50, 80}, "Крестьянин");
        arrows = 10;
        backAmmo = 1.01F;



    }

    @Override
    public String getInfo() {
        return "Я Крестьянин!";
    }
}
