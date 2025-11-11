package Recursion;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
//        fun(n--); //pass n first then subtract so it will give stack over flow

        fun(--n); //subtract first then pass n  so it will not give stack over flow
    }

}
