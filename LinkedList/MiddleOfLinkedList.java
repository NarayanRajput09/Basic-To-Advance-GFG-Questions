package LinkedList;

/*
Problem: Middle of a Linked List
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1

Description:
Given the head of a singly linked list, find the middle node of the linked list.

Time Complexity: O(N)
Space Complexity: O(1)
*/

class Solution {
    int getMiddle(Node head) {
        if (head == null) return -1;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
