package com.Shaswat;
import java.util.Scanner;

public class Waytoolongwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s = sc.nextLine();
            int sz = s.length();
            if(sz > 10){
                System.out.print(s.charAt(0));
                System.out.print(sz-2);
                System.out.println(s.charAt(sz-1));
            }
            else {
                System.out.println(s);
            }
        }
    }
}
