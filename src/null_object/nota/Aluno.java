package null_object.nota;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Aluno {
    private String nome;
    private List<Nota> notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void addNota(Nota nota) {
        this.notas.add(nota);
    }

    public Double calcularMedia() {
        return this.notas.stream().mapToDouble(Nota::getNota).average().getAsDouble();
    }

}
