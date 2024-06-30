package prog3;

public class SoundSensor implements Sensor {

    private Location location;
    @Override
    public String getSensorType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getReading() {
        return soundLevel;
    }

    @Override
    public String getLocation() {
        return this.location.toString();
    }

    private double soundLevel;

    public SoundSensor(Location location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
    }
    @Override
    public String performAction() {
        if (soundLevel > 70) {
            return "Alert: Turn on noise cancellation";
        } else {
            return "Sound is within normal range";
        }
    }
}
