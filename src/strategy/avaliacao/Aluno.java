package strategy.avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private List<Nota> notas;

    public Aluno() {
        this.notas = new ArrayList<>();
    }

    public void addNota(Nota nota) {
        this.notas.add(nota);
    }

    public int calcularNota(Formula formula) {
        return formula.calcular(notas);
    }
}
