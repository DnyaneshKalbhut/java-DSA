package KunalDSAsheet.Spcl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Revision2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int val =sc.nextInt();

        if (isArmstring(val)){
            System.out.println("yes");
        }else {

            System.out.println("no");
        }

    }


    private static boolean isArmstring(int num){
        int result =0;
        int originalNum=num;
        int count =0;
        int rem=0;

        while (originalNum!=0){
            originalNum /=10;
            ++count;
        }

        originalNum=num;

        while (originalNum!=0){
            rem = originalNum % 10;
            result+=Math.pow(rem,count);
            originalNum/=10;
        }
         return result==num;
    }


    private static void sortArr(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }

    private static int maxVal(int[] arr) {
        int max =0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
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
