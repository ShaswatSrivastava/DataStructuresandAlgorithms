package com.Shaswat;

import java.util.Stack;

public class queueusingstack {
    static class queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }

        public static void add(int data){
            s1.push(data);
        }

        public static int remove(){
            if(s1.isEmpty() && s2.isEmpty()){
                return -1;
            }

            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        public static int peek(){
            if(!s2.isEmpty()){
                return s2.peek();
            }

            if(!s1.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                return s2.peek();
            }
            return -1;
        }

        public static void main(String[] args) {
            queue q = new queue();
            q.add(1);
            q.add(2);
            q.add(3);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
