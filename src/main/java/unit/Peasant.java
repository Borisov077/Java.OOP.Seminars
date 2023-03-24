package unit;

import org.example.BaseHero;

public class Peasant extends BaseHero {
    protected int arrows;

    public Peasant(String name){
        super(100,name, 4,8,90, new int[]{50,80},"Крест");
        arrows=10;

    }
}
