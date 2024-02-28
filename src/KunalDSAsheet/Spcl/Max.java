package KunalDSAsheet.Spcl;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array");
        int size =sc.nextInt();
        System.out.println("Enter a numbers");
        int [] nums = new int[size];
        for (int i = 0; i <size; i++) {
            int val = sc.nextInt();
            nums[i] +=val;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <size ; i++) {
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);
    }
}
