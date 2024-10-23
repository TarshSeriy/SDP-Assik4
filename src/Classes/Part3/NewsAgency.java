package Classes.Part3;
import Interfaces.Part3.Observable;
import Interfaces.Part3.Observer;
import java.util.List;
import java.util.ArrayList;

public class NewsAgency implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String headline;

    public void setHeadline(String headline) {
        this.headline = headline;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(headline);
        }
    }
}
