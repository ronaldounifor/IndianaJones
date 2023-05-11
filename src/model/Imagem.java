package model;

public class Imagem {
    private String nome;
    private int comprimento;
    private int largura;

    public Imagem(String nome, int comprimento, int largura) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getComprimento() {
        return comprimento;
    }
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    public int getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Imagem '"+nome+"': "+comprimento+" x "+largura;
    }
}
