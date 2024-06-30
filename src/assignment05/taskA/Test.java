package assignment05.taskA;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        System.out.println("Before sorting with respect to name in natural order:");
        System.out.println(Arrays.toString(data));

        Arrays.sort(data, new NameComparator());

        System.out.println("After sorting with respect to name in natural order:");
        System.out.println(Arrays.toString(data));

    }
}
