package com.Shaswat;

import java.util.Arrays;

public class triangle {
    public static void main(String[] args) {
//        Triangle(4,0);
        int[] arr = {4, 3, 2, 1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void Triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            Triangle(r, c+1);
        } else {
            System.out.println();
            Triangle(r-1, c=0);
        }
    }

    //bubblesortusingrecursion

    static void bubble(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]) {
                //swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c+1);
        } else {
            bubble(arr, r-1, c=0);
        }
    }

    //selectionSortusingrecursion
    static void selection(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]) {
                selection(arr, r, c+1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            selection(arr,r-1,0,0);
        }
    }


}
