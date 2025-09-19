import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicateInCS {


    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findAllDuplicate(arr);
        System.out.println(ans);
    }

    static List<Integer> findAllDuplicate(int[] arr){
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while ( i< arr.length){
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                }
            else {
                i++;
            }
        }


        for(int j = 0; j< arr.length;j++){
            if(arr[j] != j+1){
               ans.add(arr[j]);
            }
        }

        return ans;

    }


    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
