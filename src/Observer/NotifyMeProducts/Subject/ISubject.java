package Observer.NotifyMeProducts.Subject;

import Observer.NotifyMeProducts.Observer.IObserver;

public interface ISubject {
    public void registerObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers();
}
