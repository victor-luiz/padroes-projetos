package strategy.avaliacao;

import java.util.List;

public class Ponderada implements Formula {

    @Override
    public int calcular(List<Nota> notas) {
        int media = notas.stream().mapToInt(Nota::getNotaPonderada).sum();
        int totalPeso = notas.stream().mapToInt(Nota::getPeso).sum();
        return (int) media / totalPeso;
    }
}
