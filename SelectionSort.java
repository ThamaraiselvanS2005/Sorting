import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 6, 3, 0, 8, 5};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] arr , int a , int b)
    {
         int temp = arr[a];
         arr[a] =arr[b] ;
         arr[b] = temp;
    }

    public static int maxi(int[] arr , int start , int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] > arr[max])
            {
                max= i;
            }
        }
    return max;
    }


    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int len = arr.length -1-i;
            int max = maxi(arr, 0 , len);
            swap(arr, max , len);
        }
    }
    }

