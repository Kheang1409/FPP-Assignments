package assignment03;

public class Prog5 {

    private static int maxValueInArrayGenerate(int[] arr, int index, int currentMax) {
        if (index == arr.length) {
            return currentMax;
        } else {
            if (arr[index] > currentMax) {
                currentMax = arr[index];
            }
            return maxValueInArrayGenerate(arr, index + 1, currentMax);
        }
    }

    public static int maxValueInArray(int[] arr) {
        if (arr == null || arr.length == 0)
            return -1;
        return maxValueInArrayGenerate(arr, 0, arr[0]);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 5, -3, 6, 1, 9, 4, 24 };
        System.out.println("Max value is: " + maxValueInArray(arr));
    }
}
