package observer.whasapp;

public class Message {

    private String text;
    private User usuario;

    public Message(String text, User usuario) {
        this.text = text;
        this.usuario = usuario;
    }

    public String getMessage() {
        return String.format("%s: %s", usuario.getNome(), text);
    }

    public User getUsuario() {
        return usuario;
    }
}
