public class FindInMountainArray {

    public static void main(String[] args) {
        int[] arr = {13,15,16,18,19,23,12,11,9,8,5,4,3,2,1,0};
        int ans = findInMountain(arr,3);
        System.out.println(ans);
    }

    static int findInMountain(int[] arr ,int target) {
        int peak = peakIndex(arr);
        int firstHalf = binarySearch(arr,target,0,peak);
        if(firstHalf != -1) {
            return firstHalf;
        }

      return searchInDes(arr,target,peak+1,arr.length-1);
    }

    static int peakIndex(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else  {  // if(arr[mid] < arr[mid+1])
                start = mid+1;
            }
        }
        return end;
    }



    static int binarySearch(int[] arr, int target,int start,int end){
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


    static int searchInDes(int[] arr, int target, int start, int end){
        while(end>=start){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
//                end = mid-1;
                start = mid +1;
            }
            else if(arr[mid]<target) {
//                start = mid +1;
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }




}
