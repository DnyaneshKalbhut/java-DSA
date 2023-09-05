package BinarySearch;

import java.util.Arrays;

public class SearchInMatrices {
    public static void main(String[] args) {

        int[][]matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(matrix, 37)));
    }
    public static int[] search (int[][]matrice , int target){
        int row = 0;
        int col = matrice.length-1;

        while (row<matrice.length && col >=0){
            if (matrice[row][col]==target){
                return new int[]{row,col};
            }
            if (matrice[row][col]<target){
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
