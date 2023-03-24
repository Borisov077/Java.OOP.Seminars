package unit;

import org.example.BaseHero;

public class Arbalet extends BaseHero {
    int arrows;
    int accuracy;
    public Arbalet(String name) {
        super(100, name, 1, 6, 75, new int[]{8, 14}, "Арбалетчик");
        arrows = 10;
        accuracy = 50;
    }
}
