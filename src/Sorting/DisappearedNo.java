package Sorting;

import java.util.ArrayList;
import java.util.List;

import static Sorting.Swap.swap;

public class DisappearedNo {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        int i =0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,arr[i],correct);
            }else {
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length ; j++) {
            if (arr[j]!=j+1){
                list.add(j+1);
            }
        }
return list;
    }

}