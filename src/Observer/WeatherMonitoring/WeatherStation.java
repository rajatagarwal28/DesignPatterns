package Observer.WeatherMonitoring;

import Observer.WeatherMonitoring.Observer.CurrentConditionsDisplay;
import Observer.WeatherMonitoring.Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(100, 20, 30);

        weatherData.setMeasurements(200, 30, 50);

    }
}
