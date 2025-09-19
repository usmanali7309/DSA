import java.util.Arrays;

public class BoubleShort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,6,5};
        boubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void boubleSort(int[] arr){
          for(int i = 0;i<arr.length;i++){
              for(int j=i+1;j< arr.length-i;j++){
                  if(arr[j]<arr[j-1]){
                      swapElements(arr,j,j-1);
                  }
              }
          }
    }

    private static void swapElements(int[] arr , int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
