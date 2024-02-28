package KunalDSAsheet.Spcl;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int val = sc.nextInt();
        int  [] arr = new int[val];

        for (int i = 0; i < val ; i++) {
            int var = sc.nextInt();
            arr[i]= var;
        }
        float average = averageOfNum(arr);
        System.out.println(average);
    }

    private static float averageOfNum(int [] arr) {
        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }

        float average = sum/ arr.length;

        return average;
    }
}
