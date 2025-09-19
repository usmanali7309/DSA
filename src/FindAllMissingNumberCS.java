import java.util.ArrayList;

public class FindAllMissingNumberCS {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = findMissingNumbers(arr);
        System.out.println(ans);
    }

    static ArrayList<Integer> findMissingNumbers(int[] arr){

        int i = 0;
        while ( i< arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }

        ArrayList<Integer> missingNumbers = new ArrayList<>();
        for(int j = 0; j< arr.length;j++){
            if(arr[j] != j+1){
                missingNumbers.add(j+1);

            }
        }
        return missingNumbers;
    }


    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

}
