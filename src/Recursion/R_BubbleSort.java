package Recursion;

import java.util.Arrays;

public class R_BubbleSort {

    public static void main(String[] args) {
        int arr[] = {3,2,4,6,7,1,9};
       bSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bSort(int[] arr,int r, int c){
        if(r==0){
            return;
        }
        while (r>c){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            c++;
        }
            bSort(arr,r-1,0);
    }

    public static void bSort2(int[] arr,int r, int c){
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bSort2(arr,r,c+1);

        }
        else {
          bSort2(arr,r-1,0);
        }

    }

}
