package KunalDSAsheet.Spcl;

import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("it is armstrong number "+ num);
        } else {
            System.out.println("it is not "+ num);
        }

    }

    public static boolean isArmstrong(int num) {
        int originalNum = 0;
        int rem = 0;
        int result = 0;
        int n = 0;

        originalNum = num;
        while (originalNum!=0){
            originalNum /=10;
            ++n;
        }

        originalNum=num;
        while (originalNum!=0){
            rem = originalNum%10;
            result += Math.pow(rem,n);
            originalNum/=10;
        }
        return result==num;
    }
}
