package null_object.nota;

public class App {
    public static void main(String[] args) {
        Aluno victor = new Aluno("Victor");

        Nota nota = new NotaSimples(7);
        Nota nota1 = new NotaSimples(9);

        victor.addNota(nota);
        victor.addNota(nota1);
        victor.addNota(new NotaZero());

        System.out.println("Média: " + victor.calcularMedia());
    }
}
