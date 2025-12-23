package Recursion.Strings;

import java.util.ArrayList;

public class SubsetString {
    public static void main(String[] args) {
        String str = "abc";
        subset("",str);
        subsetAscii("",str);
        ArrayList<String> ans = subset1("", str);
        System.out.println(ans);

    }

    public static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }

    public static ArrayList<String> subset1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new  ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subset1(p+ch,up.substring(1));
        ArrayList<String> right =   subset1(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void subsetAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsetAscii(p+ch,up.substring(1));
        subsetAscii(p,up.substring(1));
        subsetAscii(p+(ch+0),up.substring(1));
    }

}
