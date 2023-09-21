package Backtracking;

import java.util.Arrays;

public class MAzeAllPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
//        allPath("",board,0,0);
 int [][] path = new int[board.length][board[0].length];
 allPathPrint("",board,0,0,path,1);
    }

    static void allPath(String p ,boolean[][] maze, int row , int col){
        if (row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) return;
        maze[row][col]=false;
        if (row<maze.length-1){
            allPath(p+'D' ,maze, row +1 , col);
        }
        if (col< maze[0].length-1){
            allPath(p+'R',maze, row,col+1);
        }
        if (row>0){
            allPath(p+'U',maze , row-1,col);
        }
        if (col>0){
            allPath(p+'L',maze , row,col-1);
        }
        //here where the recursion end revert it actual structure
        maze[row][col]=true;
    }
    static void allPathPrint(String p ,boolean[][] maze, int row , int col ,int[][] path , int step){
        if (row == maze.length-1 && col == maze[0].length-1){
            path[row][col]=step;

            for (int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[row][col]) return;
        maze[row][col]=false;
        path[row][col]=step;
        if (row<maze.length-1){
            allPathPrint(p+'D' ,maze, row +1 , col,path,step+1);
        }
        if (col< maze[0].length-1){
            allPathPrint(p+'R',maze, row,col+1,path,step+1);
        }
        if (row>0){
            allPathPrint(p+'U',maze , row-1,col,path,step+1);
        }
        if (col>0){
            allPathPrint(p+'L',maze , row,col-1,path,step+1);
        }
        //here where the recursion end revert it actual structure
        maze[row][col]=true;
        path[row][col]=0;
    }
}
