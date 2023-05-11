package iterator;

import model.Imagem;

public class IteradorVetor extends Iterador {
    private Imagem[] imagens;
    private int atual;

    public IteradorVetor() {
        imagens = new Imagem[10];
        atual = -1;
    }

    public IteradorVetor(int tamanho) {
        imagens = new Imagem[tamanho];
        atual = -1;
    }

    @Override
    public boolean temProximo() {
        return imagens[atual + 1] != null;
    }

    @Override
    public Imagem proximo() {
        return imagens[++atual];
    }
}
