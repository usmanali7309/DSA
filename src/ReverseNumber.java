public class ReverseNumber {

    public static void main(String[] args) {
        int num = 456743;
        int ans = reversNumber(num);
        System.out.println(ans);
    }

    static int reversNumber(int num){
        int sum = 0;
        int rem = 0;
        while (num>0){
            rem = num%10;
            sum = sum*10+rem;
            num =  num/10;
        }
        return sum;
    }

}
