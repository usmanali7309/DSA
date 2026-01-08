package Recursion.Backtracking;

public class N_Knight {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight2(board,0,0,4);
//        System.out.println(knight(board,0));
    }

    static int knight(boolean[][] board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int col = 0; col< board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+= knight(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }


static void knight2(boolean[][] board,int row,int col,int knight){
    if(knight == 0){
        display(board);
        System.out.println();
        return;
    }

    if(row==board.length-1 && col == board.length){
        return;
    }
    if(col == board.length){
        knight2(board,row+1,0,knight);
        return;
    }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            knight2(board,row,col+1,knight-1);
            board[row][col]=false;
        }

       knight2(board,row,col+1,knight);

}


private static boolean isSafe(boolean[][] board, int row, int col) {

    if(isValid(board,row-2,col-1)) {
        if (board[row - 2][col - 1]) {
            return false;
        }
    }
    if(isValid(board,row-2,col+1)) {
        if (board[row - 2][col + 1]) {
            return false;
        }
    }

    if(isValid(board,row+1,col-2)) {
        if (board[row + 1][col - 2]) {
            return false;
        }
    }
    if(isValid(board,row-1,col-2)) {
        if(board[row-1][col-2]){
            return false;
        }
    }

        return true;
    }

    public static boolean isValid(boolean[][] board,int row , int col){
      if (row>=0 && row< board.length && col>=0 && col< board.length){
          return true;
        }
      return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print(" K");
                }else{
                    System.out.print(" X");
                }
            }
            System.out.println();
        }
    }

}
