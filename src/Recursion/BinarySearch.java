package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,8,66,78,90};
        System.out.println(binarySearch(arr,66,0, arr.length));
    }

    public static int binarySearch(int[] arr,int target,int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if (arr[mid]<target) {
            return binarySearch(arr,target,mid+1,e);
        }
        return binarySearch(arr,target,s,mid-1);
    }

}
