package assignment04.prog2;

import java.time.LocalDate;
import java.util.Scanner;


public class TestMain {

    public static void main(String[] args) {

        Professor prof1 = new Professor("Bishnu Pokhrel", 90000, LocalDate.of(2010, 6, 15), 10);
        Professor prof2 = new Professor("Alexandor obligo", 95000, LocalDate.of(2012, 9, 1), 15);
        Professor prof3 = new Professor("Taing Kheang", 92000, LocalDate.of(2015, 3, 10), 8);
        Secretary sec1 = new Secretary("Nyamdorj Ku", 50000, LocalDate.of(2018, 1, 5), 10);
        Secretary sec2 = new Secretary("Sunil Poudel", 48000, LocalDate.of(2019, 11, 20), 15);


        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = prof1;
        department[1] = prof2;
        department[2] = prof3;
        department[3] = sec1;
        department[4] = sec2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Want to see total and avg salary of department? (Y/N): ");
        String response = scanner.nextLine();
        switch (response.toLowerCase()) {
            case "y":
                double totalSalary = 0;
                for (DeptEmployee employee : department) {
                    if (employee != null) {
                        totalSalary += employee.computeSalary();
                    }
                }
                double averageSalary = totalSalary / department.length;
                System.out.println(STR."The total salary of the department is \{totalSalary}");
                System.out.println(STR."The average salary of the department is \{averageSalary}");
                break;
            case "n":
                System.out.println("Not any information showing");
                break;
            default:
                System.out.println("Invalid choice, bye!");
        }
    }
}
