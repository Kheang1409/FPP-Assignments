package assignment02.Prog3;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Event Name: ");
        String eventName = scanner.nextLine();
        LocalDateTime eventDate = readDateTime(scanner);
        Event event = new Event(eventName, eventDate);
        System.out.println(event);
        System.out.println(STR."\{event.getEventDate().getYear()} is \{Year.of(event.getEventDate().getYear()).isLeap() ? "" : "Not"}a Leap Year (\{event.intDaysLeft()} Day(s) Left)!");
        System.out.println(event.formartEventDate());
        System.out.println("""
                Time Zone Convert Available (1~5):
                1.America/Panama (1)
                2.America/Chicago (2)
                3.America/Indiana/Indianapolis (3)
                4.America/Santiago (4)
                5.America/Phoenix (5)
                """);
        System.out.print("Enter your option : ");
        String option = scanner.nextLine();
        String zoneId = switch (option) {
            case "1" -> "America/Panama";
            case "2" -> "America/Chicago";
            case "3" -> "America/Indiana/Indianapolis";
            case "4" -> "America/Santiago";
            case "5" -> "America/Phoenix";
            default -> "US/Eastern";
        };
        System.out.println(event.convertToZone(zoneId));
    }
    /**
     *
     * @param scanner
     * @return
     */
    private static LocalDateTime readDateTime(Scanner scanner) {
        while (true) {
            String format = "yyyy-MM-dd HH:mm";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            System.out.print("Enter date and time (yyyy-MM-dd HH:mm): ");
            String inputDateTime = scanner.nextLine();
            try {
                LocalDateTime date = LocalDateTime.parse(inputDateTime, formatter);
                return date;

            } catch (DateTimeParseException e) {
                System.err.println("Invalid date and time format. Please enter in the specified format (yyyy-MM-dd HH:mm).");
            }
        }
    }
}
