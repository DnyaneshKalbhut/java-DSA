package Recursion;

public class RecInarray {
    public static void main(String[] args) {
     int[]arr = {1,2,3,4,5};
        System.out.println(sorated(arr,0));

    }
    static boolean sorated(int[]arr , int index){
        if (index==arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1]&&sorated(arr,index+1);
    }
}
