package Recursion;

public class R_FindIsArrSorted {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9};
        System.out.println(isArraySorted(arr,0));
    }

    static boolean isArraySorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }

        return arr[idx]<arr[idx+1] && isArraySorted(arr,idx+1);
    }

}
