package Observer.NotifyMeProducts.Subject;

import Observer.NotifyMeProducts.Observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class PhoneSubject implements ISubject {
    List<IObserver> observers;
    public int stockCount = 0;

    public PhoneSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        if(this.stockCount == 0) {
            this.stockCount = stockCount;
            notifyObservers();
        } else {
            this.stockCount = stockCount;
        }
    }
}
