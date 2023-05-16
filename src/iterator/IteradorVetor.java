package iterator;

import model.Imagem;

public class IteradorVetor implements Iterador {
    private Imagem[] imagens;
    private int atual;

    public IteradorVetor(Imagem[] imagens) {
        this.imagens = imagens;
        atual = -1;
    }

    @Override
    public boolean temProximo() {
        return atual + 1 < imagens.length;
    }

    @Override
    public Imagem proximo() {
        return imagens[++atual];
    }
}
