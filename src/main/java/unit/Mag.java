package unit;

import org.example.BaseHero;

    public class Mag extends BaseHero{
        protected int mana;


        public Mag(String name){
            super(100, name, 2, 5, 70, new int[]{8, 14}, "Mag");
            mana = 100;


        }
    }