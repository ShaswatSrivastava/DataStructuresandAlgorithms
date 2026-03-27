package com.Shaswat;

public class Operators {
    public static void main(String[] args) {
        System.out.println("a" + "b");
        System.out.println('a' + 'b');
        System.out.println((char)('a' + 3));


        System.out.println("a" + 1);
        //this is same as after few steps: "a" + "1"
        //integer will be converted to Integer that will call toString()
    }
}
