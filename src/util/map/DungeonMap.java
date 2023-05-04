package util.map;

import util.DiceRoller;

public class DungeonMap extends Map {

    @Override
    protected void encaixarAmbiente() {
        System.out.println("Classe DungeonMap: Coloca chão de pedra");
        System.out.println("Classe DungeonMap: Coloca paredes de pedra");

        if(DiceRoller.getInstance().roll(2, 1) > 1)
            System.out.println("Classe DungeonMap: Coloca armadilha");
    }

    @Override
    protected void colocarInimigos() {
        int numeroInimigos = DiceRoller.getInstance().roll(3, 1);
        System.out.println("Classe DungeonMap: Coloca "+numeroInimigos+" esqueleto(s)");
    }
    
}
