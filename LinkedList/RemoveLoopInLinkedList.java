package LinkedList;

/*
Problem: Remove loop in Linked List
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/remove-loop-in-linked-list/1

Description:
Given the head of a linked list that may contain a loop, remove the loop from the list if present.

Time Complexity: O(N)
Space Complexity: O(1)
*/

class Solution {
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) return;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (slow == fast) {
            slow = head;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            } else {
                while (fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }
}
