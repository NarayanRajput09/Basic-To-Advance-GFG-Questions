package LinkedList;

/*
Problem: Intersection Point in Y Shaped Linked Lists
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1

Description:
Given two singly linked lists, return the point where two linked lists intersect.

Time Complexity: O(N + M)
Space Complexity: O(1)
*/

class Solution {
    int intersectPoint(Node head1, Node head2) {
        if (head1 == null || head2 == null) return -1;
        Node a = head1;
        Node b = head2;
        while (a != b) {
            a = (a == null) ? head2 : a.next;
            b = (b == null) ? head1 : b.next;
        }
        return a != null ? a.data : -1;
    }
}
