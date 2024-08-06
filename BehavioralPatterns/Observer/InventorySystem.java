package obs3;

import java.util.ArrayList;
import java.util.List;

public class InventorySystem {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void changeInventory(String message) {
        System.out.println("Inventory changed: " + message);
        notifyObservers(message);
    }
}
