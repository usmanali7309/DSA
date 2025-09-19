public class SearchInInfiniteSortedArray {

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,12,13,15,16,18,19,23,25};
        int ans = searchInInfinite(arr,19);
        System.out.println(ans);
    }

    static int searchInInfinite(int[] arr, int target) {

        int start = 0;
        int end = 1;
       while (target>arr[end]){
           int newStart = end+1;
//         Double the end size till target not found
           end = end + (end-start+1) * 2;
           start = newStart;
       }

        return  binarySearch(arr,target,start,end);
    }

    public static int binarySearch(int[] arr, int target,int start,int end){

        while(end>=start){
            int mid = start + (end-start)/2;

            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target) {
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
