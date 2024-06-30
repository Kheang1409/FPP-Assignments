package Prog2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRate {
    private static int RHR = 70;
    private static double LB = 0.50;
    private static double UB = 0.85;

    private String firstname;
    private String lastname;
    private LocalDate dateOfDate;

    public HeartRate(String firstname, String lastname, LocalDate dateOfDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfDate = dateOfDate;
    }

    public long getAge(){
        return Period.between(dateOfDate, LocalDate.now()).getYears();
    }

    public double MHR(){
        return 220-this.getAge();
    }
    public double AHR(){
        return MHR()-RHR;
    }
    public double LBTHR(){
        return AHR()*LB+RHR;
    }
    public double UBTHR(){
        return AHR()*UB+RHR;
    }
    @Override
    public String toString(){
        return STR."""
                The Target Heart Rate Range is Between \{LBTHR()} And \{UBTHR()}"
                First Name: \{firstname}
                Last Name: \{lastname}
                Age: \{getAge()}
                Date of Birth: \{dateOfDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))}
                Maximum Heart Rate: \{MHR()}
                """;
    }
}
