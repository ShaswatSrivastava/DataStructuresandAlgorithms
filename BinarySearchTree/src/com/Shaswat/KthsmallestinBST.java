package com.Shaswat;

public class KthsmallestinBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int count = 0;
    static  int Kthsmallest(Node root, int k){
        if(root == null){
            return -1;
        }

        int left = Kthsmallest(root.left, k);
        if(left != -1) return left;

        count++;
        if(count == k) return root.data;

        int right = Kthsmallest(root.right, k);
        if(right != -1) return right;

        return -1;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
        root.left.left.right = new Node(2);

        System.out.println(Kthsmallest(root, 4));

    }
}
