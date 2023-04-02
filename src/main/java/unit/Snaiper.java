package unit;

import org.example.BaseHero;

public class Snaiper extends Shooter {
    int arrows;

    int accuracy;

    public Snaiper(String name){
        super(99, 5,10, 99,10,new int[]{70,100}, "Снайпер");
        arrows = 10;
        accuracy = 70;
    }
    @Override
    public String getInfo(){
        return "Я Снайпер!";
    }
}
