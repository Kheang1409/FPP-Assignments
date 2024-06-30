package assignment04.prog2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {

    private int numberOfPublications;

    Professor(String name, double salary, LocalDate hireDate, int numberOfPublications) {
        super(name, salary, hireDate);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
