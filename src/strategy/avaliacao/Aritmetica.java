package strategy.avaliacao;

import java.util.List;

public class Aritmetica implements Formula {

    @Override
    public int calcular(List<Nota> notas) {
        double media = notas.stream().mapToInt(Nota::getValor).average().orElse(0);
        return (int) media;
    }
}
