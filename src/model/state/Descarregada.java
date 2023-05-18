package model.state;

import model.Item;
import model.weapon.Weapon;

public class Descarregada implements State {
    private Item item;

    public Descarregada(Item item) {
        this.item = item;
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public int getPrice() {
        return (item.getBasePrice() * item.getDurability())/10;
    }

    @Override
    public void handle() {
        if(item instanceof Weapon)
            if(((Weapon)item).getAmmo() > 0)
                item.setCurrentState(new Operante(item));
    }
}
