package Observer.WeatherMonitoring.Subject;

import Observer.WeatherMonitoring.Observer.IObserver;

public interface ISubject {
    public void registerObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers();
}
