public class Episodio {
    private String nome;
    private String sinopse;
    private double avaliacao;

    public Episodio(String nome, String sinopse, double avaliacao) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public double getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

}
