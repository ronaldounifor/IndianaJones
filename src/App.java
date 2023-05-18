import model.weapon.Flamethrower;

public class App {
    public static void main(String[] args) throws Exception {
        Flamethrower lancaChamas = new Flamethrower();

        lancaChamas.setWet(true);

        System.out.println("Preço: "+lancaChamas.getPrice());
        System.out.println("Dano: "+lancaChamas.getDamage());
    }

    
}