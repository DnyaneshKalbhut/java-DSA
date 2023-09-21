package Backtracking;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
     ArrayList<String > ans = pathDia("",3,3);
        System.out.println(ans);
//        path("",3,3);
    }
    static void path(String p , int row , int col){
        if (row == 1 && col == 1){
            System.out.println(p);
            return;
        }

      if (row>1){
          path(p+'D' , row -1 , col);
      }
      if (col>1){
          path(p+'R',row,col-1);
      }
    }
    static ArrayList<String> pathList(String p , int row , int col){
        if (row == 1 && col == 1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list =new ArrayList<>();
        if (row>1){
            list.addAll(pathList(p+'D', row-1,col));
        }
        if (col>1){
           list.addAll(pathList(p+'R' , row,col-1));
        }

        return list;
    }

    static ArrayList<String> pathDia(String p , int row , int col){
        if (row == 1 && col == 1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list =new ArrayList<>();
        if (row>1&&col>1){
            list.addAll(pathDia(p+'D', row-1 ,col-1));
        }
        if (row>1){
            list.addAll(pathDia(p+'V', row-1,col));
        }
        if (col>1){
            list.addAll(pathDia(p+'H' , row,col-1));
        }

        return list;
    }
}
