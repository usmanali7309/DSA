public class SearchInRange {

    public static void main(String[] args) {
      int[] arr = {34,41,23,45,65,32,4,5,67};
      int start = 1;
      int end = 7;
        int ans = linearSearch(arr, 23,start, end);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        for (int i = start;i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
