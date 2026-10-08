package LinkedList;

/*
Problem: Detect Loop in linked list
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

Description:
Given the head of a singly linked list, check if the linked list has a loop or not.

Time Complexity: O(N)
Space Complexity: O(1)
*/

class Solution {
    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
