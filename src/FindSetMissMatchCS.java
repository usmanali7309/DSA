import java.util.Arrays;

public class FindSetMissMatchCS {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = setMissMatch(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] setMissMatch(int[] arr) {
        int i = 0;
        int[] ans = {-1,-1};
        while (i< arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i , correctIndex);
            }else {
                i++;
            }
        }

        for(int j = 0;j<arr.length;j++){
            if(arr[j] != j+1){
                ans[0] = j;
                ans[1] = j+1;
            }
        }

        return ans;
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

}
