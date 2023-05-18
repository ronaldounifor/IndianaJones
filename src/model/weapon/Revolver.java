package model.weapon;

import model.state.Operante;

public class Revolver extends Weapon {

    public Revolver() {
        this.setCurrentState(new Operante(this));
        this.setAmmo(6);
        this.setBasePrice(200);
        this.setDurability(10);
        this.setBaseDamage(10);
    }
    
}
