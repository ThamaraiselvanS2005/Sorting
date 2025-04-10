public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,3,5};
        int result = cyclic(arr);
        System.out.println(result);
        //System.out.println(Arrays.toString(arr));
    }

    static int cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i+ 1)
            // arr[2] (4) != 2+1 (3) index
                {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }

            } else {
                i++;
            }
        }
        return -1;
    }

        static void swap ( int[] arr, int a, int b)
        {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }

/*
class Solution {
    public int findDuplicate(int[] arr) {
      int i = 0;
        while(i< arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        return arr[arr.length-1];
    }

    static void swap(int[] arr , int a , int b)
    {
        int temp = arr[a];
        arr[a] =arr[b] ;
        arr[b] = temp;
    }
}


 */
