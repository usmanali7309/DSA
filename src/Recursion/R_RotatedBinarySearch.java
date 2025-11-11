package Recursion;

public class R_RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(rotatedBinarySearch(arr,2,0, arr.length-1));
    }

    static int rotatedBinarySearch(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }

        int mid = s+(e-s)/2;

        if(target == arr[mid]){
            return mid;
        }

        if(arr[s]<=arr[mid]){
             if(target>arr[s] && target<arr[mid]){
//                 e = mid-1;
                 return rotatedBinarySearch(arr,target,s,mid-1);
             }
             else{
//                 s=mid+1;
                 return rotatedBinarySearch(arr,target,mid+1,e);
             }
        }
        if(target>=arr[mid] && target<arr[e]){
//            s = mid+1;
            return rotatedBinarySearch(arr,target,mid+1,e);
        }
        else{
            return rotatedBinarySearch(arr,target,s,mid-1);
        }
    }

}
