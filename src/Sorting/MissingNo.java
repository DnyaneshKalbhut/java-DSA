package Sorting;

import static Sorting.Swap.swap;

public class MissingNo {
    public static void main(String[] args) {
     int[] arr = {4,0,2,1};
        System.out.println(missNum(arr));
    }

    static  int  missNum(int[]arr){
        int i =0;
        while (i<arr.length){
            int correct = arr[i];
            if ( arr[i]< arr.length &&  arr[i]!=arr[correct]){
                swap(arr,arr[i],correct);
            }else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
}
