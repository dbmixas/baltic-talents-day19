package lt.baltic.talents.lesson.day19.behavioral.observer;

public interface Observable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
