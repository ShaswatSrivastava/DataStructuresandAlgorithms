package com.Shaswat;

public class powerofTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0){
            return false;
        }
        if (n == 1){
            return true;
        }
        return (n % 2 == 0) && isPowerOfTwo(n / 2);

    }
}
