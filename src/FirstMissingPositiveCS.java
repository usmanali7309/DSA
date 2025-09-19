public class FirstMissingPositiveCS {

    public static void main(String[] args) {
        int[] arr = {-1,3,1,4};
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {7,8,9,10};
        int ans = findFirstMissing(arr2);
        System.out.println(ans);
    }


    static int findFirstMissing(int[] arr){
        int i = 0;
        while ( i< arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]< arr.length && arr[i]>0 && arr[i] != arr[correctIndex]){
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

        return arr.length+1;
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

}
