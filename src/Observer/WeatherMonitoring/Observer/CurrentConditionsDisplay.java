package Observer.WeatherMonitoring.Observer;

import Observer.WeatherMonitoring.Subject.WeatherData;

public class CurrentConditionsDisplay implements IDisplay, IObserver {

    private WeatherData weatherData;
    private int temperature;
    private int humidity;
    private int pressure;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions Display: temperature : " + temperature +
                " humidity : " + humidity + " pressure : " + pressure);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();

    }
}
