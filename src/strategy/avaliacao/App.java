package strategy.avaliacao;

public class App {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Nota nota1 = new Nota(10, 10);
        Nota nota2 = new Nota(2, 5);
        aluno.addNota(nota1);
        aluno.addNota(nota2);
        Formula formula = new Ponderada();
        System.out.println(aluno.calcularNota(formula));
    }
}
