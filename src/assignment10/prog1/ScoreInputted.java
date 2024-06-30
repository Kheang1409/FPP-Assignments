package assignment10.prog1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreInputted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = 0.0;
        try{
            System.out.print("Enter score: ");
            score = sc.nextDouble();
            if(score < 0 || score > 100) throw new UnsupportedOperationException("inputs not in the range of 0-100.");
        }
        catch(UnsupportedOperationException ex){
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("Input Mismatch Exception");
        }
        System.out.println("Your score is: " + score);
    }
}
