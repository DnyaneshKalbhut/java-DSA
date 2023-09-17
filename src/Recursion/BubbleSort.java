package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={2,4,1,3,5};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                //swap
                int tmp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = tmp;
            }
            bubble(arr, row, col + 1);
        }else {
            bubble(arr,row-1,0);
        }
    }
}