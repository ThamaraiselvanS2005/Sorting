package Sorting;

class FindMissing {
    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 4, 0, 1, 5};
        int result = missingNumber(arr);
        System.out.println(result);

    }
    public static int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
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
            if(arr[ind] != ind){
                return ind;
            }
        }
        return arr.length;
    }

    public static void swap(int[] arr,int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
