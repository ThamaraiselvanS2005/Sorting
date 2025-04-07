package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 1, 0, 7, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr)
    {
        for (int i = 0; i < arr.length -1; i++) {
            boolean status = false;
            for (int j = 1; j < arr.length -i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    status = true;
                }
            }
            if(!status){
                break;
            }
        }
    }
}

