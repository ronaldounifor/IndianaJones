package iterator;

import model.Imagem;

public class AdversariosVetor  extends Adversarios {
    private Imagem[] imagens;
    
    public Imagem[] getImagens() {
        return imagens;
    }

    public void setImagens(Imagem[] imagens) {
        this.imagens = imagens;
    }

    public AdversariosVetor() {
        imagens = new Imagem[3];
        imagens[0] = new Imagem("Jeep", 40, 10);
        imagens[1] = new Imagem("Nave", 82, 300);
        imagens[2] = new Imagem("Trem", 10000, 20);
    }

    @Override
    public Iterador criarIterador() {
        return new IteradorVetor();
    }
}
