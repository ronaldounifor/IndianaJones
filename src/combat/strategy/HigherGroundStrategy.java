package combat.strategy;

public class HigherGroundStrategy implements CombatStrategy {

    @Override
    public int modifyDamage(int damage) {
        return Math.round(damage * 1.5f);
    }
    
}
