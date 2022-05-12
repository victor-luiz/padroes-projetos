package observer.whasapp;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Group implements Subject {

    private List<Observer> usuarios;

    private List<Message> messages;

    private Message message;

    public Group() {
        this.usuarios = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    @Override
    public void add(Observer o) {
        this.usuarios.add(o);
    }

    @Override
    public void remove(Observer o) {
        this.usuarios.remove(o);
    }

    @Override
    public String message() {
        return message.getMessage();
    }

    public void addMessage(String text, User user) {
        if (usuarios.contains(user)) {
            Message message = new Message(text, user);
            this.messages.add(message);
            this.message = message;
            this.notice();
        }
    }

    @Override
    public void notice() {
        this.usuarios.stream()
            .filter(user -> !user.equals(message.getUsuario()))
            .forEach(user -> user.update(this));
    }
}
