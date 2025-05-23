import java.util.Arrays;

public class SetmisMatrix {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = missingNumber(arr);
        System.out.println(Arrays.toString(result));

    }
    public static int[] missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] < arr.length && arr[i] != arr[correctIndex])
            {
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for(int ind = 0; ind < arr.length;ind++)
        {
            if(arr[ind] != ind +1){
                return new int[] {ind ,ind+1};
            }
        }
        return new int[] {-1,-1};
    }

    public static void swap(int[] arr,int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}