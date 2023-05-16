package observer;

import java.util.List;

public abstract class Observavel {
    List<Observador> observadores;

    public void observar(Observador observador) {
        observadores.add(observador);
    }

    public void atualizar() {
        for (Observador observador : observadores)
            observador.atualizar(this);
    }
}
