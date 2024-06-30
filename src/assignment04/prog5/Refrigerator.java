package assignment04.prog5;

public class Refrigerator implements HomeService {
    private int temperature;

    public Refrigerator(int temperature) {

        this.temperature = temperature;

    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void performFunction() {
        System.out.println(STR."Cooling items at temperature: \{temperature} °C.");
    }
}
