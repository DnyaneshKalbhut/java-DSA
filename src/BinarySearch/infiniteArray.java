package BinarySearch;

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(search(arr, target));
    }
    static int search(int [] arr , int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        // this is my new start
        while (target>arr[end]){
            // double the box value
            // end = previous end + sizeofbox*2
            int newstart=end+1;
            end=(end-start+1)*2;
            start=newstart;
        }
        return binarysearch(arr,target);
    }

    private static int binarysearch(int[] arr, int target) {
        int start =0;
        int end=arr.length-1;
        while (start<=end){
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start+(end-start)/2;

            if (target==arr[mid]){
                return mid;
            }
            if (target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
}

