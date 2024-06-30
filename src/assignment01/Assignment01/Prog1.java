package assignment01.Assignment01;

import java.util.Random;

public class Prog1 {

    public static void main(String[] args) {

        double pi = Math.PI;
        Random rand = new Random();
        int x = rand.nextInt(1, 9);
        int y = rand.nextInt(3, 14);
        double result_1 = Math.pow(pi, x);
        double result_2 = Math.pow(y, pi);
        System.out.printf("Random number of X: %d => PI to power of %d = %.2f\n", x, x, result_1);
        System.out.printf("Random number of Y: %d => %d to power of PI = %.2f\n", y, y, result_2);
    }
}


