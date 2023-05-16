package observer;

public abstract class Observador {
    public void atualizar(Observavel observavel) {
        System.out.println(observavel);
    }
}
