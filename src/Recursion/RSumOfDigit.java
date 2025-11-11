package Recursion;

public class RSumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(3425));
        System.out.println(prodOfDigit(3425));
    }

    static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sumOfDigit(n/10);
    }

    static int prodOfDigit(int n){
        if(n == 0){
            return 1;
        }
        return (n%10) * prodOfDigit(n/10);
    }

}
