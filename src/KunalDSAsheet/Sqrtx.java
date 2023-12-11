package KunalDSAsheet;

public class Sqrtx {

    class Solution {
        public int mySqrt(int x) {

            int start = 1;
            int end = x;
            int ans=0;

            while(start<=end){
                int mid = start + (end-start)/2;
                if(mid*mid==x){
                    ans = (int)mid;
                    break;
                }else if(mid*mid < x){
                    start = mid+1;
                    ans=mid;

                }else{
                    end= mid-1;
                }
            }
            return (int)ans;
        }
    }
}
