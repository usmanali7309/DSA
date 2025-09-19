public class SwapAndReverseArray {

    public static void main(String[] args) {
        int[] arr = {34,23,12,56,45,78,97,24,35};
//        swapArray(arr);
        reverseArray(arr);
        for (int ans:arr){
            System.out.print(ans+" ");
        }
    }

    private static void reverseArray(int[] arr) {
        int i = 0;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    private static void swapArray(int[] arr) {
        int i = 0;
        int start = 0;
        int end = arr.length-1;

       int temp = arr[start];
       arr[start] = arr[end];
       arr[end] = temp;

    }
}
