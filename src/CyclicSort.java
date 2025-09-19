import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
      int[] arr = {4,3,2,6,1,7,5,8,10,9};
      cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
//        int i = 0;
        for(int i = 0; i< arr.length;){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                  swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

}
