package Recursion;

public class Concept {
    public static void main(String[] args) {
        N(5);
    }

    public static void N(int n){
        if (n==0){
            return;
        }
        N(--n);
        System.out.println(n);
    }
}
