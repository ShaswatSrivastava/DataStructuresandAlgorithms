package com.Shaswat;

import java.util.Stack;

public class ValidParantheses {
        public static boolean isValid(String str){
            Stack<Character> s = new Stack<>();

            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);

                //opening
                if(ch == '(' || ch == '{' || ch == '['){
                    s.push(ch);
                } else {
                    //closing
                    if(s.isEmpty()) {
                        return false;
                    } else {
                        if((s.peek() == '('&& ch == ')')|| (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){
                            s.pop();
                        } else if(s.peek() == '(' || ch == ']') {
                            return false;
                        } else {
                            return false;
                        }
                    }
                }
            }
            if(s.isEmpty()){
                return true;
            } else {
                return false;
            }
        }


        public static boolean isDuplicate(String str){
            Stack<Character> s = new Stack<>();

            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);

                //closing
                if(ch == ')'){
                    int count = 0;
                    while(s.pop() != '('){
                        count++;
                    }
                    if(count < 1){
                        return true; // duplicate exists
                    }
                } else {
                    //opening
                    s.push(ch);
                }

            }
            return false;
        }



        public static void main(String[] args) {
            //valid string
            String str = "(]";

            System.out.println(isValid(str));

        }
    }


