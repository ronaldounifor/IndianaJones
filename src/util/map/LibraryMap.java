package util.map;

import util.DiceRoller;

public class LibraryMap extends Map {

    @Override
    protected void encaixarAmbiente() {
        System.out.println("Classe LibraryMap: Coloca chão de madeira");
        System.out.println("Classe LibraryMap: Coloca paredes de madeira");

        if(DiceRoller.getInstance().roll(10, 1) > 2)
            System.out.println("Classe LibraryMap: Coloca pista");
    }

    @Override
    protected void colocarInimigos() {
        int numeroLivros = DiceRoller.getInstance().roll(3, 1);
        System.out.println("Classe LibraryMap: Coloca "+numeroLivros+" livros(s)");
    }
    
}
