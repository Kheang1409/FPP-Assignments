package Prog2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Firstname: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Lastname: ");
        String lastName = scanner.nextLine();
        LocalDate birthOfDate = readDateTime(scanner);
//        HeartRate heartRate = new HeartRate("Group5", "FFP", LocalDate.of(1999, 12, 21));
        HeartRate heartRate = new HeartRate(firstName, lastName, birthOfDate);
        System.out.println(heartRate);
        scanner.close();

    }
    private static LocalDate readDateTime(Scanner scanner) {
        while (true) {
            String format = "yyyy-MM-dd";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            System.out.print("Enter date and time (yyyy-MM-dd): ");
            String inputDate = scanner.nextLine();
            try {
                LocalDate date = LocalDate.parse(inputDate, formatter);
                return date;

            } catch (DateTimeParseException e) {
                System.err.println("Invalid date and time format. Please enter in the specified format (yyyy-MM-dd).");
            }
        }
    }
}
