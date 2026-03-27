package com.Shaswat;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum3(35, 56);
        System.out.println(ans);
    }


    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }


    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter number 1: ");
        num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
