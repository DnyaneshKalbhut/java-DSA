package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class majorityElem {

    public static void majorityElements(int[]arr){
        HashMap <Integer , Integer > map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]+1) );
            }else {
                map.put(arr[i],1 );
            }
        }

        for (int key:
             map.keySet()) {
            if (map.get(key) > arr.length/3){
                System.out.println(key);
            }
        }
    }

    public static int union(int arr1[],int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length ; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length ; i++) {
            set.add(arr2[i]);
        }

        return set.size();
    }


    public static  int intersection (int[]arr1 , int []arr2){
        HashSet<Integer> set = new HashSet<>();
        int count =0;

        for (int i = 0; i < arr1.length ; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length ; i++) {
            if (set.contains(arr2[i])){
                count ++;
            set.remove(arr1[i]);
            }
        }
        return  count;
    }
}
