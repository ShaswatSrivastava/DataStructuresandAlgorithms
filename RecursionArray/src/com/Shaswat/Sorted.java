package com.Shaswat;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 8};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int i) {
        //base condititon
        if(i == arr.length - 1){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr, i+1);
    }
}
