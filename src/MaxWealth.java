public class MaxWealth {

    public static void main(String[] args) {
        int[][] arr = {
                {2,3,4},
                {4,2,1},
                {2,1,2},
                {7,4,3}
        };
        int ans = maxWealth(arr);
        System.out.println(ans);

    }

    static int maxWealth(int[][] arr){
        int maxWealth = 0;
        for(int person = 0;person<arr.length; person++){
            int sum=0;
              for(int account = 0 ; account<arr[person].length;account++){
                    sum = sum+arr[person][account];
                       if(maxWealth<sum) {
                           maxWealth = sum;
                       }
              }
        }
        return maxWealth;
    }


}
