import model.Bag;
import model.Hat;
import model.weapon.Revolver;
import model.weapon.Whip;

public class App {
    public static void main(String[] args) throws Exception {
        Bag mochila = new Bag();

        mochila.placeItem(new Revolver());
        mochila.placeItem(new Whip());
        mochila.placeItem(new Hat());

        Bag sacola = new Bag();
        sacola.placeItem(mochila);
    }
}