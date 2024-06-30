package assignment03;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the base number: "));
        double x = sc.nextDouble();
        System.out.print(("Enter the exponent number:"));
        int n = sc.nextInt();
        System.out.println(STR."The \{n} Power of \{x} is \{power(x, n)} compare to Math\{Math.pow(x, n)}" );
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        else if(n>0){
            return x * power(x, n-1);
        }
        else {  // Negative power case
            if (x == 0) {  // Handle division by zero for negative base and exponent
                return Double. POSITIVE_INFINITY;
            }
            return 1.0 / power(x, -n);
        }
    }
}