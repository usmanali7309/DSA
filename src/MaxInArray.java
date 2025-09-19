public class MaxInArray {

    public static void main(String[] args) {
        int[] arr = {34,23,12,56,45,78,97,24,35};
        int ans = MaxValue(arr);
        System.out.println(ans);
    }

     static int MaxValue(int[] arr) {

        int max = arr[0];
        int i=0;
        while (i< arr.length){
            if(max<arr[i]){
                max=arr[i];
            }
            i++;
        }
        return max;
    }
}
