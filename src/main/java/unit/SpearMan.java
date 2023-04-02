package unit;

import org.example.BaseHero;

public class SpearMan extends BaseHero {
    protected int accuracy; // точность удара
    protected int quonSpears, maxQuonSoears; // Количество копиий, максимальрное количество копий
    protected float backSpears; // Скорость восстановления запаса копий

    public SpearMan(String name) {
        super(100, 3, 7, 100, 7, new int[]{50, 80}, "Копейщик");
        accuracy = 30;
        quonSpears=maxQuonSoears=10;
        backSpears =1.81F;
    }

    @Override
    public String getInfo() {
        return "Я копейщик!";
    }
}
