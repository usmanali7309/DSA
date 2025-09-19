import java.sql.SQLOutput;

public class PrimeNumber {

    public static void main(String[] args) {
     int num = 23;
     boolean ans = isPrime(num);
        System.out.println(ans);
    }

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
         int c= 2;
        while (c*c<=num){
            if(num%c==0) {
                return false;
            }
            c++;
        }
        return c*c>num;
    }

}
