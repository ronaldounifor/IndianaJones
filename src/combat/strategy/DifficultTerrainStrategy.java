package combat.strategy;

public class DifficultTerrainStrategy implements CombatStrategy {

    @Override
    public int modifyDamage(int damage) {
        if(damage > 2)
            return damage - 2;

        return 0;
    }

    
}
