package Observer.WeatherMonitoring.Observer;

public interface IObserver {
    public void update(int temperature, int humidity, int pressure);
}
