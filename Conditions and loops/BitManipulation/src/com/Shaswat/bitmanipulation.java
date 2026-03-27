package com.Shaswat;

public class bitmanipulation {
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static int updateIthbit(int n, int i, int newbit){
//        if(newbit == 0){
//            return clearIthBit(n,i);
//        } else {
//            return setIthBit(n,i);
//        }
        //or another method is

//        n = clearIthBit(n, i);
//        int bitmask = newbit<<i;
//        return n|bitmask;

        n = setIthBit(n, i);
        int bitmask = newbit<<i;
        return n|bitmask;
    }

    public static int clearIbits(int n, int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }

    public static int clearbitsinrange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;

        return n&bitmask;

    }

    public static boolean isPowerofTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerofTwo(8));
    }
}
