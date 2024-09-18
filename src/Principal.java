import br.com.alura.screenmach.calculos.CalculadoraDeTempo;
import br.com.alura.screenmach.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Top Gun");
        meuFilme.setDiretor("Tom");
        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setDuracaoEmMinutos(180);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setDuracaoEmMinutos(220);

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2022);
        lost.setTemporadas(8);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Tempo para maratonar: " + lost.getDuracaoEmMinutos());
        lost.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
