package Sorting;

import java.util.Arrays;

import static Sorting.Swap.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void  CyclicSort(int[]arr){
        int i =0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,arr[i],correct);
            }else {
                i++;
            }
        }
    }
}
