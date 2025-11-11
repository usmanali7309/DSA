package Recursion;

public class R_ReduceNumToZero {

    public static void main(String[] args) {
        System.out.println(stepsToReduce(41,0));

    }

    public static int stepsToReduce(int n , int c){
        if(n==0){
            return c;
        }
        if(n%2 == 0){
           return stepsToReduce(n/2,c+1);
        }
        else {
            return stepsToReduce(n-1,c+1);
        }

    }

}
