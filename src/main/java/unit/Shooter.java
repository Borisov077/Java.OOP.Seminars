package unit;

import org.example.BaseHero;

public abstract class Shooter extends BaseHero {
    int accurance;
    int ammoReserve;

    public Shooter(int hp, int x, int y, int armor, int atak, int[] damage, String class_name){
        super(hp,x,y,armor,atak,damage,class_name);
        this.accurance= accurance;
        this.ammoReserve = ammoReserve;
    }

    }

