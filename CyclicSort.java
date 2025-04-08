package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 1, 7, 4 , 2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correctIndex = arr[i]-1;
            //arr[i]= 5 then correctIndex => 5-1=4  then if 5 in index 4 then not swap
            //else swap
            if(arr[i] != arr[correctIndex]){
                //swap 5 with correct index 4
                swap(arr, i, correctIndex);
            }
            else{
                //if element at correct index then move i once ahead
                i++;
            }
        }
    }

    static void swap(int[] arr , int a , int b)
    {
        int temp = arr[a];
        arr[a] =arr[b] ;
        arr[b] = temp;
    }
}

