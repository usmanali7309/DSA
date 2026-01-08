package Recursion.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int maze = maze(3, 3);
        System.out.println(maze);
//        mazePath(3,3,"");
//        ArrayList<String> ans = mazePathRet(3, 3, "");
//        System.out.println(ans);
//        ArrayList<String> ans = mazePathDiagnal(3, 3, "");
//        System.out.println(ans);

        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };

        mazePathRestriction(0, 0,board, "");
    }


    public static int maze(int r , int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = maze(r-1,c);
        int right = maze(r,c-1);
        return left+right;
    }

    public static void mazePath(int r , int c,String p){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            mazePath(r-1,c,p+"D");
        }
        if(c>1){
            mazePath(r,c-1,p+"R");
        }

    }


    public static ArrayList<String> mazePathRet(int r , int c, String p){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(mazePathRet(r-1,c,p+"D"));
        }
        if(c>1){
            ans.addAll(mazePathRet(r,c-1,p+"R"));
        }
       return ans;
    }

    public static ArrayList<String> mazePathDiagnal(int r , int c, String p){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1 & c>1){
            ans.addAll(mazePathDiagnal(r-1,c-1,p+"D"));
        }
        if(r>1){
            ans.addAll(mazePathDiagnal(r-1,c,p+"V"));
        }
        if(c>1){
            ans.addAll(mazePathDiagnal(r,c-1,p+"H"));
        }
        return ans;
    }

    public static void mazePathRestriction(int r , int c,boolean[][] board, String p){
        if(r==board.length-1 && c==board[r].length-1){
            System.out.println(p);
            return;
        }
        if(!board[r][c]){
            return;
        }
        if(r<board.length-1){
            mazePathRestriction(r+1,c,board,p+"D");
        }
        if(c<board[r].length-1){
            mazePathRestriction(r,c+1,board,p+"R");
        }

    }


}
