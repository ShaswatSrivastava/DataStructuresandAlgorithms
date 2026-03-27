package com.Shaswat;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 59;
        arr[2] = 43;
        arr[3] = 32;
        arr[4] = 34;
        System.out.println(arr[2]);


        //input using for loops
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");;
        }
    }
}
