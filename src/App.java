import java.util.ArrayList;

import iterator.Iterador;
import iterator.Monstros;
import iterator.Veiculos;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Iterador> iteradores = new ArrayList<>();
        iteradores.add(new Veiculos().criarIterador());
        iteradores.add(new Monstros().criarIterador());


        for (Iterador iterador : iteradores)
            while(iterador.temProximo())
                System.out.println(iterador.proximo());
        
        
    }

    
}