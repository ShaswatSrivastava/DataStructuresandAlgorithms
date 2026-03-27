package com.Shaswat;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number: " + palindrome + "is a palindrome");
        } else {
            System.out.println("Number" + palindrome + " is not a palindrome");
        }

    }

    public static boolean isPalindrome(int num){
        int palindrome = num;
        int reverse = 0;

        while (palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome/10;
        }
        return num == reverse;
    }
}
