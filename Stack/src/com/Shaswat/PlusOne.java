package com.Shaswat;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }


        int[] result = new int[n+1];
        result[0] = 1;
        return result;

    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] result = plusOne(digits);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< result.length; i++){
            sb.append(result[i]);
        }
        System.out.println(sb.toString());
    }
}
