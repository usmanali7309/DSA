import java.util.Arrays;

public class SearchInMetrinxSortedInRowColumn {

    public static void main(String[] args) {
        int[][] arr = {{3,5,13},
                       {6,8,15},
                       {7,9,17}
                       };

        int[] ans = searchMatrix(arr, 7);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchMatrix(int[][] arr,int target){
        int r = 0;
        int c = arr.length-1;

        while (r<arr.length && c>=0){
            if(target == arr[r][c]){
                return new int[]{r,c};
            }
            if(target<arr[r][c]){
                c--;
            }
            else {
                r++;
            }
        }

        return new int[]{-1, -1};
    }



}
