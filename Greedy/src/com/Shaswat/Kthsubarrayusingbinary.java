package com.Shaswat;

import java.util.Arrays;

public class Kthsubarrayusingbinary {
    static boolean check(int mid, int[] arr, int k){
        int n = arr.length;
        int count = 0;
        int sum = 0;

        for(int i=0; i<n; i++){
            if(arr[i] > mid){
                return false;
            }
            sum += arr[i];
            if(sum > mid){ //split the array
                count++; //number of splits
                sum = arr[i];
            }
        }
        count++; //no of subarrays
        return count <= k;
    }

    static int splitArray(int[] arr, int k){
        int n = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();

        int start = max;
        int end = 0;

        for(int i=0; i<n; i++){
            end += arr[i];
        }
        int ans = 0;
        while(start <= end){
            int mid = (start+end)/2;

            if(check(mid, arr, k)){
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 3;
        System.out.println(splitArray(arr,k));
    }
}
