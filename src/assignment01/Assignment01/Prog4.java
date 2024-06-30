package assignment01.Assignment01;

import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        String[] arr = {"horse", "dog", "cat", "horse", "dog"};
        String[] arr_removeDuplicate = new String[arr.length];
        int count=0;
        boolean isDuplicate = false;

        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr_removeDuplicate.length; j++){
                if(arr[i].equals(arr_removeDuplicate[j])){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                arr_removeDuplicate[count] = arr[i];
                count++;
                isDuplicate = false;
            }
        }
        String[] result = new String[count];
        for(int i = 0; i < count; i++){
            result[i] = arr_removeDuplicate[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
