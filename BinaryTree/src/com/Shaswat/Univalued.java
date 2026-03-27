package com.Shaswat;

public class Univalued {
    static class Node{
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isUnivaltree(Node root){
        if(root == null){
            return true;
        }

        if(root.left != null && root.data != root.left.data){
            return false;
        }

        if(root.right != null && root.data != root.right.data){
            return false;
        }

        return isUnivaltree(root.left) && isUnivaltree(root.right);
    }

    public static void main(String[] args) {
//        1
//       / \
//      2   3
//     / \  / \
//    4  5  6  7
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);

        System.out.println(isUnivaltree(root));
    }
}
