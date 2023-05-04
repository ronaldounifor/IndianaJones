import combat.CombatController;
import combat.strategy.DifficultTerrainStrategy;
import combat.strategy.HigherGroundStrategy;
import model.weapon.Revolver;
import model.weapon.Weapon;

public class App {
    public static void main(String[] args) throws Exception {
        Weapon arma = new Revolver();

        CombatController combate = new CombatController();
        combate.addStrategy(new DifficultTerrainStrategy());
        combate.addStrategy(new HigherGroundStrategy());

        int danoOriginal = arma.dealDamage();

        System.out.println("Dano original: "+danoOriginal);
        int danoFinal = combate.applyDamage(danoOriginal);
        System.out.println("Dano final: "+danoFinal);
    }
}