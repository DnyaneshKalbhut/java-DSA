package BinarySearch;

public class floor {
    public static void main(String[] args) {
        int[]arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(Floorsearh(arr,target));
    }
    public  static  int Floorsearh(int[]arr,int target){
        int start =0;
        int end=arr.length-1;
        while (start<=end){
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
        return end;
    }
}

