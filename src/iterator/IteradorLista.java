package iterator;

import java.util.ArrayList;

import model.Imagem;

public class IteradorLista extends Iterador {
    private ArrayList<Imagem> imagens;
    private int atual;

    public IteradorLista() {
        imagens = new ArrayList<>();
        atual = -1;
    }
    
    @Override
    public boolean temProximo() {
        return imagens.get(atual + 1) != null;
    }

    @Override
    public Imagem proximo() {
        return imagens.get(++atual);
    }
}