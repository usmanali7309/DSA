import java.util.Arrays;

public class FindMissingNumberByCyclicS {

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,7,5,8,10,9};
        int ans = findMissing(arr);
        System.out.println(ans);
    }

//    static void cyclicSort(int[] arr){
//
//        for(int i = 0; i< arr.length;i++){
//            int correctIndex = arr[i]-1;
//            if(arr[i] != arr[correctIndex]){
//                swap(arr,i,correctIndex);
//            }
//            else {
//                i++;
//            }
//        }
//    }

    static int findMissing(int[] arr){
        int i = 0;
        while ( i< arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]< arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }

        for(int j = 0; j< arr.length;j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }

        return arr.length;
    }


    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }


}
