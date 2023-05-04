package combat;

import java.util.ArrayList;
import java.util.List;

import combat.strategy.CombatStrategy;

public class CombatController {
    List<CombatStrategy> strategies;

    public CombatController() {
        strategies = new ArrayList<>();
    }

    public void addStrategy(CombatStrategy strategy) {
        strategies.add(strategy);
    }

    public int applyDamage(int damage) {
        for (CombatStrategy combatStrategy : strategies) {
            System.out.println("Aplicando dano "+combatStrategy.getClass().getName());
            System.out.print("Dano: " + damage + " -> ");
            damage = combatStrategy.modifyDamage(damage);
            System.out.println(damage);
        }
        return damage;
    }

}
