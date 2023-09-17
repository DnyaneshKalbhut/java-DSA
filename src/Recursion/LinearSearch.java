package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
    int[]arr = {12,4,56,7,7,6,68};
    int target = 7;
    findAllIndex(arr,target,0);
        System.out.println(list);
        System.out.println(findAllIndex(arr,target,0,new ArrayList<>()));
    }
    static int search(int []arr , int target , int index){
        if (arr[index]==target){
            return index;
        }
        if (arr[index]==-1){
            return -1;
        }
        return search(arr,target,index+1);
    }

    static ArrayList<Integer>list = new ArrayList<>();
    static  void findAllIndex(int []arr, int target ,int index ){
        if (arr[index]==target){
            list.add(index);
        }
        if (arr[index]==arr.length-1){
            return;
        }
        findAllIndex(arr,target,index+1);
    }

 // returing through inside array list
    static ArrayList<Integer> findAllIndex(int []arr, int target ,int index,ArrayList<Integer> list ){
        if (arr[index]==target){
            list.add(index);
        }
        if (arr[index]==arr.length-1){
            return list;
        }
       return findAllIndex(arr,target,index+1,list);
    }


    /// Dont take arrayLiat in Argument

    static ArrayList<Integer> findAlIndex(int []arr, int target ,int index){
        ArrayList<Integer> list =new ArrayList<>();
        if (arr[index]==target){
            list.add(index);
        }
        if (arr[index]==arr.length-1){
            return list;
        }
        ArrayList<Integer> ansFromBelow=  findAlIndex(arr,target,index+1);
     list.addAll(ansFromBelow);
     return list;
    }
}
