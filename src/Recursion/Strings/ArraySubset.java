package Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubset {
    public static void main(String[] args) {
      int[] arr = {1,2,2};
        List<List<Integer>> ans = arraySubset(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }

//        List<List<Integer>> ans = arraySubsetDuplicate(arr);
//        for(List<Integer> list : ans){
//            System.out.println(list);
//        }
    }

    public static List<List<Integer>> arraySubset(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for(int i =0 ; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }


    public static List<List<Integer>> arraySubsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0 ; i<arr.length;i++){
            start=0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            int n = outer.size();
            for(int j =0 ; j < n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }


}
