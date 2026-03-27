package com.Shaswat;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 45, 67, 24, 98);
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
