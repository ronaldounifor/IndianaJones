package combat.strategy;

public class BlindStrategy implements CombatStrategy {

    @Override
    public int modifyDamage(int damage) {
        return damage/2;
    }
    
}
