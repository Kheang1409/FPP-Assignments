package assignment01.Assignment01;

import java.util.*;

public class Prog5 {
    public static void main (String[]args){
        int[] arraya = {5, 6, -4, 3, 1}; //regular array declaration
        System.out.println(Arrays.toString(combine(arraya,new int[] {3, 8, 9, 11}))); //anonymous array
    }

    public static int[] combine(int[] a, int[] b) {
        if(a.length == 0 && b.length == 0)
            return new int[] {};
        int[] result = new int[a.length + b.length];
        int i = 0;
        for ( ; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            result[i] = b[j];
            i++;
        }
        return result;
    }
}