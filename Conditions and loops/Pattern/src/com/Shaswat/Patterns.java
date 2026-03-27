package com.Shaswat;

public class Patterns{
    public static void hollow_rectangle(int totrows, int totcols){
        for (int i = 1; i <= totrows; i++){
            for (int j = 1; j <= totcols; j++){
                if(i == 1 || i == totrows || j == 1 || j== totcols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void InvertedRotatedHalfPyramid(int n) {
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        //1st half
        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }

            //hollow-rectangle - stars
            for(int j = 1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        //1st half
        //spaces
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        InvertedRotatedHalfPyramid(4);
//        zero_one_triangle(4);
//        butterfly(4);
//        solid_rhombus(5);
//        hollow_rhombus(5);
        diamond(4);
    }
}
