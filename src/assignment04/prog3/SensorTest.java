package prog3;

public class SensorTest {

    public static void main(String[] args) {

            Sensor[] sensors = new Sensor[5];
            sensors[0] = new LightSensor(Location.GARAGE, 80);
            sensors[1] = new SoundSensor(Location.HOME, 65);
            sensors[2] = new TemperatureSensor(Location.KITCHEN, 25);
            sensors[3] = new LightSensor(Location.LAUNDRY_ROOM, 120);
            sensors[4] = new SoundSensor(Location.RESTROOM, 82);

            for (Sensor sensor : sensors) {
                if(sensor != null) {
                    System.out.println("Sensor Type: " + sensor.getSensorType());
                    System.out.println("Reading: " + sensor.getReading());
                    System.out.println("Location: " + sensor.getLocation());
                    System.out.println("Last Updated: " + sensor.getLastUpdated());
                    System.out.println("Action: " + sensor.performAction());
                    System.out.println();
                }
            }
        }
    }
