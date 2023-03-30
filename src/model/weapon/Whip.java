package model.weapon;

import util.DiceRoller;

public class Whip implements Weapon {

    @Override
    public int dealDamage() {
        return DiceRoller.roll(4, 1);
    }
    
}
