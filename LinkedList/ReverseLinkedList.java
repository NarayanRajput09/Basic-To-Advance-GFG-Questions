package LinkedList;

/*
Problem: Reverse a linked list
Difficulty: Easy
Link: https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1

Description:
Given the head of a singly linked list, reverse the list and return its head.

Time Complexity: O(N)
Space Complexity: O(1)
*/

class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

class Solution {
    Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
