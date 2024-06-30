package assignment01.Assignment01;

public class Prog2 {

    public static void main(String args[]){

        float a = 1.27F;
        float b = 3.881F;
        float c = 9.6F;

        float sum=a+b+c;
        System.out.printf("The sum of %.3f + %.3f + %.3f = %.3f then cast int = %d\n", a, b, c, sum ,(int)sum); // (int) cast type of sum to int;
        System.out.printf("The sum of %.3f + %.3f + %.3f = %.3f then rounded up = %d\n", a , b, c, sum, Math.round(sum)); //Math round func return value as Int
    }
}
