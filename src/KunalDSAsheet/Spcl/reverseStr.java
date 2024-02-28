package KunalDSAsheet.Spcl;

import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String str = sc.nextLine();

        String rev = reverse(str);

        System.out.println(rev);
    }

    public  static String reverseString(String str){
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length-1;

        while (start<=end){
            char temp = charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }
        return new String(charArray);

    }

    public static String reverse(String str){
       String newStr = "";

       int size =str.length()- 1;

        for (int i = size; i>0 ; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }
}
