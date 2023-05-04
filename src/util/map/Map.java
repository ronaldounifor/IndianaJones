package util.map;

import util.DiceRoller;

public abstract class Map {
    
    public void gerar() {
        criarPrimeiroAmbiente();

        int numeroAmbientes = DiceRoller.getInstance().roll(2, 2);
        for (int i = 0; i < numeroAmbientes; i++) {
            System.out.println("Classe Map: Criando ambiente "+(i+1));
            encaixarAmbiente();

            int numeroEncontros = DiceRoller.getInstance().roll(3, 1);
            for (int j = 0; j < numeroEncontros; j++)
                posicionarEncontro();
        }

        colocarInimigos();
        criarUltimoAmbiente();
    }

    public void criarPrimeiroAmbiente() {
        System.out.println("Classe Map: Porta criada no primeiro ambiente");
        System.out.println("Classe Map: Tocha criada no primeiro ambiente");
        System.out.println("Classe Map: Chão criado no primeiro ambiente");
        System.out.println("Classe Map: Indiana Jones iniciará no quadrado (1,1)");
    }

    public void criarUltimoAmbiente() {
        System.out.println("Classe Map: Baú criado no último ambiente");
        System.out.println("Classe Map: Saída criada no último ambiente");
        adicionarTesouro();
    }

    protected abstract void encaixarAmbiente();

    public void posicionarEncontro() {
        System.out.println("Classe Map: Gera desafio ou recompensa aleatoriamente");
        System.out.println("Classe Map: Posiciona desafio ou recompensa aleatoriamente");
    }

    protected abstract void colocarInimigos();

    public void adicionarTesouro() {
        System.out.println("Classe Map: Cria um tesouro aleatoriamente");
        System.out.println("Classe Map: Adiciona o tesouro no baú do ultimo ambiente");
    }

}
