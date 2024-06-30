package assignment02.Prog3;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Event {
    private String eventName;
    private LocalDateTime eventDate;

    public Event(String eventName, LocalDateTime eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    @Override
    public String toString() {
        return STR."Event: \{eventName} is on \{eventDate.getDayOfWeek()} \{eventDate}";
    }

    public long intDaysLeft() {
        return ChronoUnit.DAYS.between(LocalDateTime.now().toLocalDate(), eventDate.toLocalDate());
    }

    public String formartEventDate() {
        return eventDate.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm [zzz]"));
    }

    /**
     * @param targetZoneId
     * @return
     */
    public String convertToZone(String targetZoneId) {
        LocalDateTime targetDateTime = eventDate.atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneId.of(targetZoneId)).toLocalDateTime();
        return targetDateTime.atZone(ZoneId.of(targetZoneId)).format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm [zzz]"));
    }


}
