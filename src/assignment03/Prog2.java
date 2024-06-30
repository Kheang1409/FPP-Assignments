package assignment03;

public class Prog2 {
    public static void main(String[] args) {
        String str = "Hello, 911!"; // space is the lowest
        System.out.println(STR."The smallest character in \{str} is '\{minCharOfString(str)}'"); // space~' '
    }
    public static char minCharOfString(String s){
        if(s == null) return '\0';
        if(s.length() == 0) return '\u0000';
        if(s.length() == 1) return s.charAt(0);
        return s.charAt(0) < minCharOfString(s.substring(1)) ? s.charAt(0) : minCharOfString(s.substring(1));
    }
}
