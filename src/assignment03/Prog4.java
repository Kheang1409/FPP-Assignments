package assignment03;

public class Prog4 {
    public static void main(String[] args) {
        int[] nums = new int[] {121, 123, 606};
        for(int num: nums)
            System.out.println(STR."\{num} is\{isPalindrome(num)?"":" not"} Palindrome");
    }

    public static boolean isPalindrome(int num){
        if(num == reserveInt(num)){
            return true;
        }
        return false;
    }

    private static int reserveInt(int n){
        if(n==0) return n;
        return (n<0?-1:1) * reserveIntGenerator(Math.abs(n), 0);
    }

    private static int reserveIntGenerator(int n, int sum){
        if(n==0) return sum;
        sum=sum*10 + n%10;
        return reserveIntGenerator(n/10, sum);
    }
}

