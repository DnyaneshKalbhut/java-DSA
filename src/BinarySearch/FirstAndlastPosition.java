package BinarySearch;

public class FirstAndlastPosition {
    public static void main(String[] args) {

        int[]arr ={2,7,7,7,7,23,45,67};
        int target=7;
        System.out.println(searchRange(arr,target));
    }

    public  static int[] searchRange(int[]arr,int target){
     int[] ans = {-1,-1};
      int start = search(arr,target,true);
      int end = search(arr,target,false);
     start= ans[0];
      end=ans[1];
      return ans;
    }
    public static int search(int[]arr , int target , boolean firstIndex){
        int ans=-1;
        int start =0;
        int end=arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else {
                ans=mid;
            }
            if (firstIndex){
                end=mid-1;
            }else {
                start=mid+1;
            }

        }
        return ans;
    }
}
