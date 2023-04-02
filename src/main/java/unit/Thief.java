package unit;

import org.example.BaseHero;

public class Thief extends BaseHero {
    protected boolean stealth, magicResistance; // Скрытность, сопротивляемость магии
    protected int timeStealth, timeResistance;


    public Thief(String name) {

        super(70, 1, 3, 50, 2, new int[]{60, 100}, "Вор");
        timeStealth = timeResistance =60;
        stealth = magicResistance = false;
    }

    @Override
    public String getInfo() {
        return "Я Вор!";
    }
}
