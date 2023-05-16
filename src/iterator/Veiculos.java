package iterator;

import model.Imagem;

public class Veiculos  implements Adversarios {
    private Imagem[] imagens;
    
    public Imagem[] getImagens() {
        return imagens;
    }

    public Veiculos() {
        imagens = new Imagem[3];
        imagens[0] = new Imagem("Jeep", 40, 10);
        imagens[1] = new Imagem("Nave", 82, 300);
        imagens[2] = new Imagem("Trem", 10000, 20);
    }

    @Override
    public Iterador criarIterador() {
        return new IteradorVetor(imagens);
    }
}
