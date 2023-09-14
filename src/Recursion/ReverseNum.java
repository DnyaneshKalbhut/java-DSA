package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
// reverse1(1234);
//        System.out.println(sum);

        System.out.println(reverse2(1234));
        System.out.println(isPalindrome(1234321));
    }



    static int sum =0;
    static void reverse1(int n ){
        if (n==0){
            return;
        }

        int rem =n%10;
        sum = sum*10 + rem;
    reverse1(n/10);
    }


    static int reverse2(int n){
        int digit = (int) (Math.log10(n))+1;
        return  helper(n,digit) ;
    }

    private static int helper(int n, int digit) {
     if (n%10==n){
         return n;
     }
        int rem = n%10;

     return rem*(int)(Math.pow(10,digit-1)) +helper(n/10 , digit-1);
    }


    static boolean isPalindrome(int n){
        return n==reverse2(n);
    }

}
