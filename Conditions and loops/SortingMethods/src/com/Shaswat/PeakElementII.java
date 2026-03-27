package com.Shaswat;

import java.util.Arrays;

public class PeakElementII {
    public static void main(String[] args) {
        int[][] mat = {
                {8, 6},
                {10, 1}
        };
        int[] ans = findPeakGrid(mat);
        System.out.println(Arrays.toString(ans));

    }

    public static int findMaxIndex(int[][] mat, int rows, int mid, int cols){
        int maxValue = -1;
        int index = -1;
        for(int i = 0; i < rows; i++){
            if(mat[i][cols] > maxValue){
                maxValue = mat[i][cols];
                index = i;
            }
        }
        return index;
    }

    public static int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        //Apply Binary Search
        int low = 0;
        int high = cols - 1;
        while (low <= high){
            int mid = low + (high - low)/2;
            int maxRowIndex = findMaxIndex(mat, rows, cols, mid);
            int left = mid - 1 >= 0 ? mat[maxRowIndex][mid - 1] : -1;
            int right = mid + 1 < cols ? mat[maxRowIndex][mid + 1]: - 1;

            if (mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right){
                //Location of peak element;
                return new int[] {maxRowIndex, mid};
            }
            else if(mat[maxRowIndex][mid] < left){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new  int[] {-1, -1};
    }
}
