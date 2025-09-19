import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 4, 7},
                {5, 3, 9, 6},
                {87, 34,}
        };
        int[] ans = searchIn2DArray(arr, 9);
        System.out.println(Arrays.toString(ans));
    }

    static  int[] searchIn2DArray(int[][] arr,int target){
        for(int row=0;row<arr.length; row++){
            for(int col =0; col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
