package Observer.WeatherMonitoring.Subject;

import Observer.WeatherMonitoring.Observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject{
    private final List<IObserver> observers;
    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData(){
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
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
        measurementsChanged();
    }

}
