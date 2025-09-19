package Recursion;

import java.sql.SQLOutput;

public class RFibo {
    public static void main(String[] args) {
        System.out.println(fibonaci(7));
        for(int i = 0 ; i<=7;i++){
            System.out.print(fibonaci(i)+" ");
        }


    }

    public static int fibonaci(int n){
        if(n<2){
            return n;
        }
        return fibonaci(n-1)+fibonaci(n-2);
    }

}
