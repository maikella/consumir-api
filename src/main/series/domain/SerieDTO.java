import java.time.LocalDate;
import java.util.List;

public final class SerieDTO {
    private final String nome;
    private final String numeroDeEpisodios;
    private final List<Episodio> episodios;
    private final String sinopse;
    private final LocalDate dataDeLancamento;
    private final double avaliacao;

    public SerieDTO(String nome, String numeroDeEpisodios, List<Episodio> episodios, String sinopse,
            LocalDate dataDeLancamento, double avaliacao) {
        this.nome = nome;
        this.numeroDeEpisodios = numeroDeEpisodios;
        this.episodios = episodios;
        this.sinopse = sinopse;
        this.dataDeLancamento = dataDeLancamento;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public String getSinopse() {
        return sinopse;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }
}