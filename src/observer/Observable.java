package observer;

public interface Observable {
    void attach(Observer obs);
    void detach(Observer obs);
    void notifyObservers();
}
