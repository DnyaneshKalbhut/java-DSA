package Recursion;

public class product {
    public static void main(String[] args) {
        System.out.println(productofNo(55));
    }
    public static int productofNo(int n){
        if (n%10==n){
            return n;
        }

        return (n%10)*productofNo(n/10);
    }
}
