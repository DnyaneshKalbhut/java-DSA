import java.util.Arrays;

import static Sorting.Swap.swap;

public class SelectionSort {

    public static void main(String[] args) {

        int [] arr = {5,4,3,2,1};
         SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void SelectionSort(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length-i-1;
            int maxIndex = getmaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }

    private static int getmaxIndex(int[] arr, int start, int end) {
        int max =start;
        for (int i = start; i <=end ; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
