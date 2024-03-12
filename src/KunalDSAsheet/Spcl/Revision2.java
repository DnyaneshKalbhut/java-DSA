package KunalDSAsheet.Spcl;

import java.util.Arrays;
import java.util.Scanner;

public class Revision2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to reverse it ");
        int val = sc.nextInt();

        int reverse = reverNum(val);
        System.out.println(reverse);
    }

    private static int reverNum(int val) {
        int reverse =0;
        while (val!=0){
            int digit = val%10;
            reverse =reverse*10 + digit;
            val/=10;
        }
        return reverse;
    }

    private static String reverseStr(String str){
        String reverse ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse +=str.charAt(i);
        }
        return reverse;
    }

    private static int averageNum(int[] arr) {
        int sum =0;
        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
        }

        return sum/arr.length;
    }



}
