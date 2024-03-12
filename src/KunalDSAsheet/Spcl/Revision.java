package KunalDSAsheet.Spcl;

import java.util.Arrays;
import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        //consonents
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a alphabet");
//        char ch = sc.nextLine().charAt(0);
//        if (ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
//            System.out.println("entered a vowel");
//        }else {
//            System.out.println("enter a consonent");
//        }

        //string matching
//        System.out.println("Enter a 2 string");
//        String str1= sc.nextLine();
//         String str2 = sc.nextLine();
//
//         if (str1 == str2){
//             System.out.println("its matching");
//         }else {
//             System.out.println("its matching");
//
//         }

        // reverse a number
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//
//        int reverse = reversenum(num);
//        System.out.println(reverse);

        //reverse a String
//        System.out.println("Enter a String");
//        String str = sc.nextLine();
//
//        String reverse = revStr(str);
//        System.out.println(reverse);

        //Average

//        System.out.println("Enter a size for an array");
//        int size = sc.nextInt();
//        System.out.println("Enter numbers");
//        int[] arr = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            int element = sc.nextInt();
//            arr[i] += element;
//        }
//
//        int avg = average( arr);
//        System.out.println(avg);

        //Evenodd

//        System.out.println("Enter a number");
//         int num = sc.nextInt();
//
//         if (num%2==0){
//             System.out.println("even");
//         }else {
//             System.out.println("odd");
//         }

//        sorting

        System.out.println("Enter a size of an array");
        int size = sc.nextInt();

        System.out.println("Enter a numbers");
        int [] arr = new int[size];

        for (int i = 0; i <size ; i++) {
            int element = sc.nextInt();;
            arr[i] =element;
        }

        sortingNum(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void sortingNum(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static int average(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
        }
        return  sum/ arr.length;
    }
    private static String revStr(String str) {
        String str2 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }

    private static int reversenum(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return reverse;
    }
}
