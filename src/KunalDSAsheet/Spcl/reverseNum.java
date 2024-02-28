package KunalDSAsheet.Spcl;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a number to reverse : " );
        int num =sc.nextInt();

        int reverse = reverseNumber(num);
        System.out.println(reverse);
    }

    private static int reverseNumber(int num) {
        int reverse = 0;

        while (num!=0){
            int digit = num % 10 ;
            reverse = reverse * 10 + digit;
            num /=10;
        }
        return reverse ;
    }


}
