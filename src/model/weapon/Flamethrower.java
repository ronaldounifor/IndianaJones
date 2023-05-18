package model.weapon;

import model.state.Operante;

public class Flamethrower extends Weapon {

    public Flamethrower() {
        this.setCurrentState(new Operante(this));
        this.setAmmo(45);
        this.setBasePrice(2000);
        this.setDurability(5);
        this.setBaseDamage(25);
    }
    
}
