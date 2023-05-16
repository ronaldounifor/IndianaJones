package observer;

public class Masmorra extends Observavel {
    private int id;
    private String tesouro;
    private int nivelDificuldade;

    public Masmorra(int id, String tesouro, int nivelDificuldade) {
        this.id = id;
        this.tesouro = tesouro;
        this.nivelDificuldade = nivelDificuldade;
    }

    @Override
    public String toString() {
        return "Masmorra "+id+" - Dificuldade: "+nivelDificuldade+", Tesouro: "+tesouro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTesouro() {
        return tesouro;
    }

    public void setTesouro(String tesouro) {
        this.tesouro = tesouro;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }
}
