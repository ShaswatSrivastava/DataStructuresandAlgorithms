package com.Shaswat;

public class Comparison {
    public static void main(String[] args) {
        String A = "Shaswat";
        String B = "Shaswat";

//        System.out.println(A == B);

        //creating different objects of same value
        String a = new String("Shaswat");
        String b = new String("Shaswat");

//        System.out.println(a == b);

        System.out.println(a.equals(b));


    }
}
