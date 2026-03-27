package com.Shaswat;

import java.util.LinkedList;
import java.util.Queue;

public class Kthlevel {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        int level;
        Node node;

        public Info(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public static void iterative(Node root, int k){
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root, 1));
//        q.add(null);
        int level = 1;
        
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null) {
                return;
            }
            if(curr.level == k){
                System.out.print(curr.node.data + " ");
            } else {
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.level+1));
                }

                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.level+1));
                }
            }
        }
    }

    //Recursive approach
    public static void Klevel(Node root, int level, int k){//O(n)
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data + " ");
            return;
        }

        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }

    public static void main(String[] args) {
//        1
//       / \
//      2   3
//     / \  / \
//    4  5  6  7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

//        int k = 3;
//        Klevel(root, 1, k);
        iterative(root, 3);

    }
    }
