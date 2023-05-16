import observer.Jogador;
import observer.Masmorra;

public class App {
    public static void main(String[] args) throws Exception {
        Masmorra torreAlien = new Masmorra(0, "Pistola Laser", 5);
        Masmorra baseNazista = new Masmorra(1, "Metralhadora", 1);
        
        Jogador ronaldo = new Jogador(0, 9001, "Ronaldo");
        Jogador indiAnna = new Jogador(1, 2, "Anna");
        Jogador ford = new Jogador(2, 9002, "Harrison");

        torreAlien.observar(ronaldo);
        torreAlien.observar(indiAnna);
        torreAlien.observar(ford);
        baseNazista.observar(ford);

        torreAlien.atualizar();
        baseNazista.atualizar();
        
    }

    
}