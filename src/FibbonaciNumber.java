public class FibbonaciNumber {
    public static void main(String[] args) {
     fibo(8);
    }

    static void fibo(int n){
        int a= 0;
        int b = 1;
        int i = 0;
        while(i<=n){
            int temp = b;
            System.out.print(a+" ");
            b = a+b;
            a = temp;
            i++;
        }

    }

}
