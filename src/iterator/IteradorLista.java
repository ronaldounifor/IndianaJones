package iterator;

import java.util.ArrayList;

import model.Imagem;

public class IteradorLista implements Iterador {
    private ArrayList<Imagem> imagens;
    private int atual;
    
    public IteradorLista(ArrayList<Imagem> imagens) {
        this.imagens = imagens;
        this.atual = -1;
    }

    @Override
    public boolean temProximo() {
        return atual + 1 < imagens.size();
    }

    @Override
    public Imagem proximo() {
        return imagens.get(++atual);
    }
}