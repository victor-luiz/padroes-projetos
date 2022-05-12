package observer.whasapp;

public class App {

    public static void main(String[] args) {
        User victor = new User("Victor");
        User deigao = new User("Diegão");

        Group prova = new Group();
        prova.add(victor);
        prova.add(deigao);

        prova.addMessage("Olá Diegão", victor);
    }
}
