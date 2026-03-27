package com.Shaswat;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
//        skip("","aabcdahm");
//        System.out.println(skip1("baccdah"));;
//        System.out.println(skipApple(skipApple("bacapplecdh")));
//        System.out.println(skipAppnotApple("bacapplcdh"));
//        subseq("", "abc");
        System.out.println(subseqRet("", "abc"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        if(c == 'a'){
            skip(p, up.substring(1));
        } else {
            skip(p + c, up.substring(1));
        }
    }

    static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip1(up.substring(1));
        } else {
            return ch + skip1(up.substring(1));
        }
    }

    // we want to skip "apple"

    static String skipApple(String up){
        if(up.isEmpty()) {
            return "";
        }


        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0)  + skipApple(up.substring(1));
        }
    }

    static String skipAppnotApple(String up){
        if(up.isEmpty()) {
            return "";
        }


        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppnotApple(up.substring(3));
        } else {
            return up.charAt(0)  + skipAppnotApple(up.substring(1));
        }
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    //Using ArrayList
    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
