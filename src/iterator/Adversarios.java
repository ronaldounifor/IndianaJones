package iterator;

import java.util.List;

import model.Imagem;

public abstract class Adversarios {
    private Iterador iterador;
     
    public Iterador getIterador() {
        return iterador;
    }

    public void setIterador(Iterador iterador) {
        this.iterador = iterador;
    }

    public abstract Iterador criarIterador();
}
