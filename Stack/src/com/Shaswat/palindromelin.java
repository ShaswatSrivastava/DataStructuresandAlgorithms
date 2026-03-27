package com.Shaswat;

public class palindromelin {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

        // Recursive Function to check whether
        // the list is palindrome
        static boolean isPalindromeRecur(Node end, Node[] start) {

            // base case
            if (end == null) return true;

            // Recursively check the right side.
            boolean right = isPalindromeRecur(end.next, start);

            // Compare the start and end nodes.
            boolean ans = right && start[0].data == end.data;

            // Update the start node
            start[0] = start[0].next;

            return ans;
        }

        // Function to check whether the list is palindrome
        static boolean isPalindrome(Node head) {

            // Set starting node to head
            Node[] start = new Node[]{head};

            // Recursively check the ll and return
            return isPalindromeRecur(head, start);
        }

        public static void main(String[] args) {

            // Linked list : 1->2->3->2->1
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(2);
            head.next.next.next.next = new Node(1);

            boolean result = isPalindrome(head);

            if (result)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
