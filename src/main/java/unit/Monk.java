package unit;

import org.example.BaseHero;

public class Monk extends BaseHero {
    protected int mana, aura;
    protected float backMana;

    public Monk(String name) {
        super(100, 5, 9, 90, 5, new int[]{30, 90}, "Монах");
        mana = 100;
        aura = 100;
        backMana = 1.01F;
    }

    @Override
    public String getInfo() {
        return "Я Монах!";
    }
}
