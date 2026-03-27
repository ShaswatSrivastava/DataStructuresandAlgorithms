package com.Shaswat;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Heightofatree {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int count (Node root){
        if(root == null){
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount+rightcount+1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightsum = sum(root.right);
        return leftSum + rightsum + root.data;
    }
    public static int diameter2(Node root){ // O(n^2)
        if(root == null){
            return 0;
        }
        int leftdiam = diameter2(root.left);
        int leftht = height(root.left);
        int rightdiam = diameter2(root.right);
        int rightht = height(root.right);

        int selfdiam = leftht + rightht + 1;
        return Math.max(selfdiam, Math.max(leftdiam, rightdiam));

    }
    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){ //O(n)
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static boolean isIdentical(Node node, Node subroot){
        if(node == null || subroot == null){
            return true;
        } else if(node == null || subroot == null || node.data != subroot.data){
            return false;
        }

        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
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
//
//        2
//       / \
//      4   5

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

//        System.out.println(height(root));
//        System.out.println(count(root));
//        System.out.println(sum(root));
//        System.out.println(diameter(root).diam);
        System.out.println(isSubtree(root, subRoot));
    }
}
