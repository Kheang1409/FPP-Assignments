package prog3;

public class LightSensor implements Sensor{

    private double lightLevel;
    private Location location;

    public LightSensor(Location location, double lightLevel) {
        this.lightLevel = lightLevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
    public String getLocation() {
        return location.toString();
    }

    @Override
    public String performAction() {
        if (lightLevel < 100) {
            return "Alert: Turn on the light";
        } else {
            return "Light is sufficient";
        }
    }
}
