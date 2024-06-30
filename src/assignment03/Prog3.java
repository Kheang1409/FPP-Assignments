package assignment03;

import java.util.Arrays;

public class Prog3 {
    public static void main(String[] args) {

        int[] initialArray = {1, 3, 4, 7, 9, 13};
        System.out.println(STR."Array Before Reversing:\{Arrays.toString(initialArray)}");
        reverseArray(initialArray);
        System.out.println(STR."Array After Reversing:\{Arrays.toString(initialArray)}");
    }

    public static int[] reverseArray(int[] array) {
        if(array == null || array.length == 0) return array;
        reverseArrayGenerator(array, 0, array.length - 1);
        return array;
    }

    private static void reverseArrayGenerator(int[] array, int i, int j) {
        if (i >= j) {
            return;
        }
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        reverseArrayGenerator(array, ++i, --j);

    }
}
