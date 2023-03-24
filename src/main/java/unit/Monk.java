package unit;

import org.example.BaseHero;

public class Monk extends BaseHero {
    protected int mana;

    public Monk(String name){
        super(100, name, 5,9,90, new int[]{30,90},"Монах");
        mana=90;
    }
}
