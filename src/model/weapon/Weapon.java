package model.weapon;

import model.Item;

public abstract class Weapon extends Item {
    private int baseDamage;
    private int ammo;

    public int getDamage() {
        return getCurrentState().getDamage();
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
        this.getCurrentState().handle();
    }
}