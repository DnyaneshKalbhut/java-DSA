package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
       int []arr = {5,3,4,2,1};
       selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int row, int col , int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[max]) {
                selectionSort(arr, row, col + 1,col);
                }
        }else {
            int temp = arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
            selectionSort(arr,row-1,0,0);
        }
    }
}
