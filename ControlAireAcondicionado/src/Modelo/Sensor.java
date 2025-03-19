package Modelo;
import java.util.Random;

public class Sensor {
    private double temperatura;
    private double humedad;
    private Random random = new Random();

    public Sensor() {
        actualizarValores();
    }

    public void actualizarValores() {
        this.temperatura = 25 + random.nextDouble() * 10; // Entre 25°C y 35°C
        this.humedad = 50 + random.nextDouble() * 50; // Entre 50% y 100%
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }
}
