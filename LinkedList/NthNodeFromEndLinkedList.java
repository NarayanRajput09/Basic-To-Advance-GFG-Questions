package LinkedList;

/*
Problem: Nth node from end of linked list
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

Description:
Given a linked list and an integer n, find the nth node from the end of the linked list.

Time Complexity: O(N)
Space Complexity: O(1)
*/

class Solution {
    int getKthFromLast(Node head, int k) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) return -1;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow != null ? slow.data : -1;
    }
}
