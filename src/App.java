import java.util.Arrays;
import java.util.List;

import iterator.AdversariosLista;
import iterator.AdversariosVetor;
import model.Imagem;

public class App {
    public static void main(String[] args) throws Exception {
        AdversariosLista monstros = new AdversariosLista();
        AdversariosVetor veiculos = new AdversariosVetor();

        for (Imagem imagem : monstros.getImagens())
            System.out.println(imagem);
        
        Imagem[] imagens = veiculos.getImagens();
        for (int i = 0; i < imagens.length; i++)
            System.out.println(imagens[i]);
        
        
    }

    
}