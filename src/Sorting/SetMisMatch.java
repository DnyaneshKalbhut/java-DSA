package Sorting;

import static Sorting.Swap.swap;

public class SetMisMatch {
    public static void main(String[] args) {

    }


    static int[] missNum(int[]arr){
        int i =0;
        while (i<arr.length){
            int correct = arr[i] +1;
            if (arr[i]!=arr[correct]){
                swap(arr,arr[i],correct);
            }else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index]!=index){
                return new int[] {arr[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }
}
