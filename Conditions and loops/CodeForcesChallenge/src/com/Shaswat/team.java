package com.Shaswat;
import java.util.Scanner;

public class team {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int ans = 0;
            for(int i = 0; i < n; i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();

                int count = 0;
                if(a == 1){
                    count++;
                }
                if(b == 1){
                    count++;
                }
                if(c == 1){
                    count++;
                }
                if(count >= 2){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
