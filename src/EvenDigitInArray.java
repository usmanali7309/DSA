import java.util.Arrays;

public class EvenDigitInArray {

    public static void main(String[] args) {
        int[] arr = {456,4567,34,8342,86798,567,4563};
        int[] ans = searchEvenDigit(arr);
        System.out.println(Arrays.toString(ans));
    }

    static  int[] searchEvenDigit(int[] arr){
        if(arr.length == 0) {
            return new int[]{-1, -1};
        }
        int[] ans = new int[6];
        int start = 0;
        int end = arr.length;
        int i=0;
        while (start<end){
          boolean isTrue =  isEvenDigit(arr[start]);
           if (isTrue){
               ans[i] = arr[start];
               i++;
           }
            start++;
        }
      return ans;

    }

    private static boolean isEvenDigit(int n) {
//        if (Math.log10(n)){
//            return true;
//        }
        int count = 0;
        while (n>0){
            n = n/10;
            count++;
        }
        if(count%2 == 0){
            return true;
        }
//      return (int)(Math.log10(n))+1;
        return false;
    }

}
