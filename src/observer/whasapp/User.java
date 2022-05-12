package observer.whasapp;

import observer.Observer;
import observer.Subject;

import java.util.Objects;

public class User implements Observer {

    private String nome;

    public User(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(subject.message());
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User usuario = (User) o;
        return getNome().equals(usuario.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
}
