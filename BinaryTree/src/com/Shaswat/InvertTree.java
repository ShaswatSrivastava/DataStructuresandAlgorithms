package com.Shaswat;

public class InvertTree {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node invert(Node root){
        if(root == null){
            return null;
        }

        Node invertleft = invert(root.left);
        Node invertRight = invert(root.right);

        root.left = invertRight;
        root.right = invertleft;

        return root;
    }

    public static void inorder(Node root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
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

        invert(root);
        inorder(root);

    }
}
