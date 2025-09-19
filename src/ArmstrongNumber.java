public class ArmstrongNumber {
    public static void main(String[] args) {
//     int num = 153;
//     boolean ans = isArmstrong(153);
//        System.out.println(ans);

     armstrongNumbers();
    }

    static boolean isArmstrong(int num){
       int sum = armstrongNumber(num);
       return sum==num;
    }

    static void armstrongNumbers(){
        for(int i = 2;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static int armstrongNumber(int num){
        int rem = 0;
        int sum = 0;
        while (num>0){
          rem = num%10;
          sum= sum+rem*rem*rem;
          num = num/10;
        }
        return sum;
    }

}
