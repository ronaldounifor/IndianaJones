package iterator;

import model.Imagem;

public abstract class Iterador {
    public abstract boolean temProximo();
    public abstract Imagem proximo();
}
