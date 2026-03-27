package com.Shaswat;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6},
                {67,98, 8, 56},
                {72, 59},
                {52, 74, 81, 69}
        };
        int target = 81;
        int[] ans = search(arr, target);
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                   max = arr[row][col];
                }
            }
        }
        return max;
     }
















     static int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
