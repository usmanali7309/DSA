import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,7,7,7,7 ,9, 10, 11};
        int[] ans = firstAndLastPosition(arr, 7);
        System.out.println(Arrays.toString(ans));
    }

    static int[] firstAndLastPosition(int[] arr, int target){
        int[] ans = {-1,-1};
        int firstIndex = search(arr, target, true);
        int lastIndex = search(arr, target, false);
        ans[0] = firstIndex;
        ans[1] = lastIndex;
        return ans;
    }


    static int search(int[] arr,int target,boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return ans;
     }



    }
