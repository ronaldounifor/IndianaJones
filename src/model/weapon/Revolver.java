package model.weapon;

import util.DiceRoller;

public class Revolver extends Weapon {

    @Override
    public int dealDamage() {
        DiceRoller roller = DiceRoller.getInstance();
        return roller.roll(4, 4);
    }
    
}
