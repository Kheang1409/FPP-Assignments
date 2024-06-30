package assignment05.taskD;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        System.out.println("Before sorting with respect to name in reverse order:");
        System.out.println(Arrays.toString(data));

        Arrays.sort(data, new Comparator<DeptEmployee>() {
            @Override
            public int compare(DeptEmployee e1, DeptEmployee e2) {
                return e2.getName().compareTo(e1.getName());
            }
        });

        System.out.println("After sorting with respect to name in reverse order:");
        System.out.println(Arrays.toString(data));

    }
}
