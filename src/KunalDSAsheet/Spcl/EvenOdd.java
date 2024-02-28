package KunalDSAsheet.Spcl;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n o to check odd or even");
        int num = sc.nextInt();

        int oddOrEven = oddEven(num);
        System.out.println(oddOrEven);
    }

    private static int oddEven(int num) {
          if (num%2 ==0 ){
              System.out.println("it is an even no : ");
          }else {
              System.out.println("it is an odd no");
          }

        return 0;
    }
}
