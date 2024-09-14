public final class EpisodioDTO {
    private final String nome;
    private final String sinopse;
    private final double avaliacao;

    public EpisodioDTO(String nome, String sinopse, double avaliacao) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.avaliacao = avaliacao;
    }
    public String getNome() {
        return nome;
    }
    public String getSinopse() {
        return sinopse;
    }
    public double getAvaliacao() {
        return avaliacao;
    }
}
