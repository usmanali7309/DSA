public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {9,13,18,23,24,26,29,32,33,35,38};
        int ans = ceilingNumber(arr, 34);
        System.out.println(ans);
    }

    private static int ceilingNumber(int[] arr,int target) {
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end = arr.length-1;

        while(start<=end){
           int mid = start+(end-start)/2;
           if(target>arr[mid]){
              start = mid+1;
           }
           else if(target<arr[mid]){
               end=mid-1;
            }
            else {
               return mid;
            }
        }
        return start;
    }
}
