package model.weapon;

import model.state.Operante;

public class Whip extends Weapon {

    public Whip() {
        this.setCurrentState(new Operante(this));
        this.setAmmo(Integer.MAX_VALUE);
        this.setBasePrice(100);
        this.setDurability(10);
        this.setBaseDamage(4);
    }

}
