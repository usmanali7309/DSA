public class SearchInRotatedArray {
    public static void main(String[] args) {
//        int[] arr = {13,15,16,18,19,23,12,11,9,8,5,4,3,2,1,0}; confusion on rotation ant mountain arr
//        int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {4,4,6,7,0,1,4};
        int ans = searchTarget(arr,6);
        System.out.println(ans);
    }

    static  int searchTarget(int[] arr, int target){
//        int pivot = findPivot(arr);
        int pivot = findPivotWithDuplicate(arr);
        if(target==arr[pivot]){
            return pivot;
        }
        if(target>=arr[0]){
         return binarySearch(arr,target,0,pivot-1);
        }

        return binarySearch(arr,target,pivot+1,arr.length-1);
    }


    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;

            if (mid<end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if(mid>start && arr[mid] < arr[mid-1])  {
                return mid-1;
            }
            else if( arr[mid] < arr[start])  {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }


    static int findPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;

            if (mid<end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if(mid>start && arr[mid] < arr[mid-1])  {
                return mid-1;
            }
            else if(arr[start] == arr[mid] && arr[mid] == arr[end]){

//                check if start or end is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;

            } else if (arr[start]<arr[mid] || (arr[mid]==arr[start] && arr[mid]>arr[end])) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start,int end){
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
