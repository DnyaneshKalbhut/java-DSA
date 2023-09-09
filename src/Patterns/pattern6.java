package Patterns;

public class pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }
    public static  void pattern6(int n){
        for (int row =0 ; row <=2*n ; row++) {
            int totalcol=row>n?2*n-row : row;
            int spaces = n-totalcol;
            for (int s = 0; s <spaces ; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <totalcol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


