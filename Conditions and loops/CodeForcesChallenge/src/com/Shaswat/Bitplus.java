package com.Shaswat;
import java.util.Scanner;

public class Bitplus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int count = 0;
        for(int i = 0; i < n; i++){
            String s = in.nextLine();
            if(s.charAt(1) == '+') {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(count);
    }
}
