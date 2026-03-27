package com.Shaswat;

public class Overloading {
    public static void main(String[] args) {
       sum(2,4);
       sum(44,23,78);
       int ans = sum(34,56,78);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }


}
