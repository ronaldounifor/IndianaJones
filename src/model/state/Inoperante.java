package model.state;

import model.Item;
import model.weapon.Weapon;

public class Inoperante implements State {
    private Item item;

    public Inoperante(Item item) {
        this.item = item;
    }

    @Override
    public int getDamage() {
        if(item instanceof Weapon)
            return ((Weapon)item).getBaseDamage()/10;
        else
            return 0;
    }

    @Override
    public int getPrice() {
        int valorBase = (item.getBasePrice() * item.getDurability())/10;

        if(item.getDurability() == 0)
            return 0;
        
        if(item.isWet())
            return (valorBase*8)/10;

        return valorBase;
    }

    @Override
    public void handle() {
        if(item.getDurability() > 0 && !item.isWet())
            item.setCurrentState(new Operante(item));
    }
    
}
