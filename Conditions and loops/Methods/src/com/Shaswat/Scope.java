package com.Shaswat;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
//            int a = 78; // already initialised outside the block in the same method; hence you cannot initialise again
            a = 67; // reassign the original ref variable to some other variable
            int c = 89;
            // values initialised in this block, will remain in the block;
            System.out.println(a);
            // Scoping in for loops





        }
        System.out.println(a);



    }
}
