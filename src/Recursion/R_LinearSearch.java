package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class R_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9,9,6,0};
        System.out.println(linearSearch(arr,9,0));
        System.out.println(linearSearchLast(arr,9,arr.length-1));

        findAllSearch(arr,9,0);
        System.out.println(list);

        ArrayList<Integer> value = findAllSearch2(arr, 9, 0, new ArrayList<>());
        System.out.println(value);

        System.out.println(findAllSearch3(arr, 9, 0));

    }

    static int linearSearch(int[] arr,int target,int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearSearch(arr,target,index+1);

    }

    static int linearSearchLast(int[] arr,int target,int index){
        if(index == -1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearSearchLast(arr,target,index-1);

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllSearch(int[] arr,int target,int index){
        if(index == arr.length-1){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAllSearch(arr,target,index+1);
    }


    static ArrayList<Integer> findAllSearch2(int[] arr,int target,int index ,ArrayList<Integer> list){
        if(index == arr.length-1){
            return list ;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllSearch2(arr,target,index+1,list);
    }

    static ArrayList<Integer> findAllSearch3(int[] arr,int target,int index ){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length-1){
            return list ;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllSearch3(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }


}
