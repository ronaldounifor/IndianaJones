package model.state;

import model.Item;
import model.weapon.Weapon;

public class Operante implements State {
    private Item item;

    public Operante(Item item) {
        this.item = item;
    }

    @Override
    public int getDamage() {
        if(item instanceof Weapon)
            return ((Weapon)item).getBaseDamage();
        else
            return 0;
    }

    @Override
    public int getPrice() {
        return (item.getBasePrice() * item.getDurability())/10;
    }

    @Override
    public void handle() {
        if(item.isWet() || item.getDurability() == 0)
            item.setCurrentState(new Inoperante(item));

        if(item instanceof Weapon)
            if(((Weapon)item).getAmmo() == 0)
                item.setCurrentState(new Descarregada(item));
    }
    
}
