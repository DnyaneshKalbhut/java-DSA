package Sorting;

import static Sorting.Swap.swap;

public class findDuplicates {
    public static void main(String[] args) {

    }

    public  int findDuplicate(int[]arr){
        int i =0;
        while (i<arr.length){
            if (arr[i]!=i+1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, arr[i], correct);
                } else {
                    return arr[i];
                }
            }  else {
                i++;

            }
        }
        return -1;
    }
}
