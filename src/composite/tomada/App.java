package composite.tomada;

public class App {
    public static void main(String[] args) {
        Receptor receptor = new Receptor();
        Tomada tomada = new TomadaSimples();
        receptor.setTomada(tomada);

        Tomada regua1 = new Regua(3);
        tomada.adicionarTomada(regua1);
        Tomada regua2 = new Regua(4);
        regua1.adicionarTomada(regua2);
        Tomada regua3 = new Regua(7);
        regua2.adicionarTomada(regua3);
        Tomada regua4 = new Regua(9);
        regua3.adicionarTomada(regua4);

        System.out.println("Entrada disponiveis: " + tomada.entradasDiponiveis());
    }
}
