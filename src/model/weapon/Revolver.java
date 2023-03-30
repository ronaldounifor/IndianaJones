package model.weapon;

import util.DiceRoller;

public class Revolver implements Weapon {

    @Override
    public int dealDamage() {
        return DiceRoller.roll(4, 4);
    }
    
}
