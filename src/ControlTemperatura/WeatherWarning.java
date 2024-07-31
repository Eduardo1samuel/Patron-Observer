package ControlTemperatura;

public class WeatherWarning implements Observer{
    private static final int TEMPERATURA_LIMITE = 28;


    @Override
    public void update(int temperature) {
        if (temperature > TEMPERATURA_LIMITE) {
            System.out.println("Weather Warning: ¡Advertencia! La temperatura ha superado " +
                    "los " + TEMPERATURA_LIMITE + " grados.");
        }
    }
}
