package observer;

public class Jogador extends Observador {
    private int id;
    private int nivel;
    private String nome;
    
    public Jogador(int id, int nivel, String nome) {
        this.id = id;
        this.nivel = nivel;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
