package KunalDSAsheet.Spcl;

import java.util.Scanner;

public class ConcentVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a alphabet");
        char alphabet = sc.nextLine().charAt(0);

        if (alphabet=='a' || alphabet=='A' || alphabet=='e' ||alphabet=='E' ||alphabet=='i' ||alphabet=='I' ||alphabet=='O' ||alphabet=='o' ||alphabet=='u' ||alphabet=='u' ){
            System.out.println("you enter vowels");
        }else {
            System.out.println("enter consonent");
        }
    }
}
