package Recursion.Strings;

import java.util.ArrayList;

public class PhonePad {

    public static void main(String[] args) {
        System.out.println(padRet("","12"));
        System.out.println(padRet1("","12",new ArrayList<>()));
         pad("","12");
        System.out.println(padCount("","12"));

    }

    public static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3; i<digit*3;i++){
            char ch = (char)('a'+i);
            pad(p+ch,up.substring(1));
        }

    }

    public static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3; i<digit*3;i++){
            char ch = (char)('a'+i);
           count = count + padCount(p+ch,up.substring(1));
        }
        return count;
    }

    public static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3; i<digit*3;i++){
            char ch = (char)('a'+i);
            ans.addAll(padRet(p+ch,up.substring(1)));
        }
       return ans;
    }

    public static ArrayList<String> padRet1(String p, String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3; i<digit*3;i++){
            char ch = (char)('a'+i);
            padRet1(p+ch,up.substring(1),list);
        }
        return list;
    }

}
