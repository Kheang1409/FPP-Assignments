package assignment01.Assignment01;

public class Prog6 {
    public static void main(String[] args) {
        int[] arr = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        int first=arr[0];
        int second=arr[1];
        for(int i=2; i<arr.length;i ++){

            if(first > arr[i]){
                second = first;
                first=arr[i];
            }
            if(second > arr[i] && arr[i] > first){
                second = arr[i];
            }
        }

        System.out.println(STR."minimun value: \{first} & the sec-minimun value: \{second}");
    }
}
