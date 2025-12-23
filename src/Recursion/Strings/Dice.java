package Recursion.Strings;

public class Dice {
    public static void main(String[] args) {
//      dice("",4);
      diceFace("",7,8);
    }

    public static void dice(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1;i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }

    public static void diceFace(String p,int target,int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1;i<=face && i<=target;i++){
            diceFace(p+i,target-i,face);
        }
    }

}
