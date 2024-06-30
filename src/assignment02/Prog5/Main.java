package Prog5;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            String shapes = """
                    Enter C for Circle
                    Enter R for Rectangle
                    Enter T for Triangle
                    Choose your option:  """;
            System.out.print(shapes);
            switch (input.nextLine().substring(0, 1).toUpperCase()) {
                case "R"->{
                    System.out.print("Enter the width of the Rectangle: ");
                    double widthRec = input.nextDouble();
                    System.out.print("Enter the height of the Rectangle: ");
                    double heightRec = input.nextDouble();
                    Rectangle rectangle = new Rectangle(widthRec, heightRec);
                    System.out.println("The area of Rectangle is: " + rectangle.computeArea());
                }
                case "T"-> {
                    System.out.print("Enter the height of the triangle: ");
                    double heightTria = input.nextDouble();
                    System.out.print("Enter the base of the triangle: ");
                    double baseTria = input.nextDouble();
                    Triangle triangle = new Triangle(heightTria, baseTria);
                    System.out.println("The area of Triangle is: " + triangle.computeArea());
                }
                case "C"-> {
                    System.out.print("Enter the radius of the Circle: ");
                    double radius = input.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("The area of Circle is: " + circle.computeArea());
                }
                default->{
                    System.out.print("Invalid choice. Please try again...");
                    continue;
                }
            }
            input.nextLine(); // Consume the newline character : the double value and leaves the newline character untouched.
            System.out.print("Do you want to continue(Y/N)?");
            if (input.nextLine().toUpperCase().substring(0,1).equals("N")) {
                break;
            }
        }
        /*Text Style*/
        String RESET = "\u001B[0m";  // Reset formatting
        String GREEN = "\u001B[32m"; // Green text
        System.out.println(GREEN+"Thanks for using the program!"+RESET);
        input.close();
    }
}
