package com.Shaswat;

import java.util.ArrayList;

public class find {
    public static void main(String[] args) {
        int[] arr ={2, 3, 1, 4, 5};
        System.out.println(find(arr,4, 0));
        System.out.println(findIndex(arr, 4, 0));

        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static boolean find(int[] arr, int target, int i){
        if(i == arr.length){
            return false;
        }
        return arr[i] == target || find(arr, target, i+1);
    }

    static int findIndex(int[] arr, int target, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        } else {
            return findIndex(arr, target, i+1);
        }
    }

    static ArrayList findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

         return findAllIndex(arr, target, index+1, list);

    }
}
