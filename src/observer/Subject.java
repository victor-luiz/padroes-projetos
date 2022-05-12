package observer;

public interface Subject {
    void add(Observer o);
    void remove(Observer o);
    String message();
    void notice();
}
