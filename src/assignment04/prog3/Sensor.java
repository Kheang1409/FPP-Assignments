package prog3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Sensor {

    String getSensorType();

    double getReading();

    String getLocation();

    default String getLastUpdated(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm a"));
    };

    String performAction();
}