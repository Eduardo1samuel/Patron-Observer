package ControlTemperatura;

public class MainTemperatura {
    public static void main(String[] args) {
        // Creacion de la instancia de WeatherStation
        WeatherStation weatherStation = new WeatherStation();

        // Creacion de las instancias de los observadores
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        // Agregar los observadores a la estación meteorológica
        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(weatherWarning);

        // Simulacion de cambios en la temperatura
        weatherStation.setTemperature(30);
        weatherStation.setTemperature(40);
    }
}
