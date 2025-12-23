package Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
//      pemutation("","abc");
        System.out.println(pemutationCount("","abc"));
        ArrayList<String> ans = pemutationRet("", "abc");
        System.out.println(ans);
    }

    public static void pemutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            pemutation(f+ch+s,up.substring(1));
        }
    }

    public static int pemutationCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count+pemutationCount(f+ch+s,up.substring(1));
        }
        return count;
    }

    public static ArrayList<String> pemutationRet(String p, String up){
        if(up.isEmpty()){
//            System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ArrayList<String> retValue = pemutationRet(f+ch+s,up.substring(1));
            ans.addAll(retValue);
        }
        return ans;
    }

}
