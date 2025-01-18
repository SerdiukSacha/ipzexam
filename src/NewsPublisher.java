import java.util.ArrayList;
import java.util.List;

// Observer (ConcreteSubject)
class NewsPublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Notification notification) {
        for (Observer observer : observers) {
            observer.update(notification);
        }
    }

    public void sendNews(Notification notification) {
        notifyObservers(notification);
    }
}
