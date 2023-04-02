package unit;

import org.example.BaseHero;

    public class Mag extends BaseHero {
        protected int mana;
        protected  float backMana;


        public Mag(String name) {
            super(100, 2, 5, 70, 8, new int[]{8, 14}, "Mag");
            mana = 100;
            backMana = 1.01F;

        }

        @Override
        public String getInfo() {
            return "Я Маг!";
        }
    }