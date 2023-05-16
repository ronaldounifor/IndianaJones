package iterator;

import java.util.ArrayList;

import model.Imagem;

public class Monstros implements Adversarios {
    private ArrayList<Imagem> imagens;
    
    public ArrayList<Imagem> getImagens() {
        return imagens;
    }

    public Monstros() {
        imagens = new ArrayList<>();
        imagens.add(new Imagem("Esqueleto", 10, 10));
        imagens.add(new Imagem("Alien", 100, 1));
        imagens.add(new Imagem("Nazista", 12, 12));
    }

    @Override
    public Iterador criarIterador() {
        return new IteradorLista(imagens);
    }


}
