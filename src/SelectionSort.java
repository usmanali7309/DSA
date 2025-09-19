import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,1,2,4,6,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int lastIndex = arr.length-1-i;
            int maxAt = findMax(arr,0,lastIndex);
            swapElements(arr,maxAt,lastIndex);
        }
    }

    static int findMax(int[] arr,int first,int last){
        int max = first;
        for(int i = 0;i<last;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }


    private static void swapElements(int[] arr , int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
