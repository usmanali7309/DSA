package Recursion.Backtracking;

import java.util.Arrays;

public class AllDirectionPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };

//        allPath(0, 0,board, "");
        int[][] path = new int[board.length][board[0].length];
        allPathPrint(0, 0,board, "",path,1);
    }

    public static void allPath(int r , int c,boolean[][] board, String p){
        if(r==board.length-1 && c==board[r].length-1){
            System.out.println(p);
            return;
        }
        if(!board[r][c]){
            return;
        }

        board[r][c] = false;

        if(r<board.length-1){
            allPath(r+1,c,board,p+"D");
        }
        if(c<board[r].length-1){
            allPath(r,c+1,board,p+"R");
        }
        if(r>0){
            allPath(r-1,c,board,p+"U");
        }
        if(c>0){
            allPath(r,c-1,board,p+"R");
        }

//     Revert the chages made by recursion call following
        board[r][c] = true;

    }

    public static void allPathPrint(int r , int c,boolean[][] board, String p,int[][] path,int step){
        if(r==board.length-1 && c==board[r].length-1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!board[r][c]){
            return;
        }

        board[r][c] = false;
        path[r][c] = step;
        if(r<board.length-1){
            allPathPrint(r+1,c,board,p+"D", path,step+1);
        }
        if(c<board[r].length-1){
            allPathPrint(r,c+1,board,p+"R", path,step+1);
        }
        if(r>0){
            allPathPrint(r-1,c,board,p+"U", path,step+1);
        }
        if(c>0){
            allPathPrint(r,c-1,board,p+"R", path,step+1);
        }

//     Revert the chages made by recursion call following
        board[r][c] = true;
        path[r][c] = 0;
    }

}
