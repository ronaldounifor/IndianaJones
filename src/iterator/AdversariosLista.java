package iterator;

import java.util.ArrayList;

import model.Imagem;

public class AdversariosLista extends Adversarios {
    private ArrayList<Imagem> imagens;
    
    public ArrayList<Imagem> getImagens() {
        return imagens;
    }

    public void setImagens(ArrayList<Imagem> imagens) {
        this.imagens = imagens;
    }

    public AdversariosLista() {
        imagens = new ArrayList<>();
        imagens.add(new Imagem("Esqueleto", 10, 10));
        imagens.add(new Imagem("Alien", 100, 1));
        imagens.add(new Imagem("Nazista", 12, 12));
    }

    @Override
    public Iterador criarIterador() {
        return new IteradorLista();
    }

    public void adicionarImagem(Imagem imagem) {
        imagens.add(imagem);
    }

    
    
}
