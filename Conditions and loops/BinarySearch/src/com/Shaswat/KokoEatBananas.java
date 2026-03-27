package com.Shaswat;

public class KokoEatBananas {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int result = minEatingSpeed(piles, h);
        System.out.println(result);
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getmax(piles);
        while(low <= high){
            int mid = low + (high - low)/2;
             int hours = 0;
             for(int i = 0; i < piles.length; i++ ){
                 hours += Math.ceil(1.0*piles[i]/mid);
                 if(hours > h){
                     low = mid + 1;
                 } else {
                     high = mid - 1;
                 }
             }
        }
        return low;
    }

    private static int getmax(int[] piles) {
        int max = piles[0];
        for (int i =1; i < piles.length; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }
        return max;
    }
}
