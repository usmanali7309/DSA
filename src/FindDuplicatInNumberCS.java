public class FindDuplicatInNumberCS {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }

    static int findDuplicate(int[] arr){
        int i = 0;

        while ( i< arr.length){
            if(arr[i] != i+1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                }
                else {
                    return arr[i];
                }
            }
            else {
               i++;
            }
        }

//        for(int j = 0; j< arr.length;j++){
//            if(arr[j] != j+1){
//               ans = arr[j];
//            }
//        }

        return -1;

    }


    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
