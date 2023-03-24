package unit;

import org.example.BaseHero;

public class Snaiper extends BaseHero {
    int arrows;

    int accuracy;

    public Snaiper(String name){
        super(99,name, 5,10, 99,new int[]{70,100}, "Снайпер");
        arrows = 10;
        accuracy = 70;
    }
}
