package com.Shaswat;

import java.util.Arrays;

public class Max {
    public static void main(String[] args){
        int[] arr = {1, 3, 45, 9, 78};
//        System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            swap(arr,start, end);
            start ++;
            end --;
        }

    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


// imagine that arr is not empty
     static int max(int[] arr) {
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }


}
