package ControlTemperatura;

public class TemperatureDisplay implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("Temperature Display: La temperatura actual es: " + temperature);
    }
}
