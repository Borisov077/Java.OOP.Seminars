package unit;

import org.example.BaseHero;

public class Arbalet extends Shooter {
    int arrows;
    int accuracy;

    public Arbalet(String name) {
        super(100, 1, 6, 75, 5, new int[]{8, 14}, "Арбалетчик");
        arrows = 10;
        accuracy = 50;
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик!";
    }
}
