package KunalDSAsheet.Spcl;

import java.util.Scanner;


public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter numbers ");
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            arr[i] = element;
        }

        sortingArray(arr);

        for (int num : arr
        ) {
            System.out.print(num + " ");
        }
    }

    static void sortingArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
