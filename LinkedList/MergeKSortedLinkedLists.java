package LinkedList;

import java.util.PriorityQueue;

/*
Problem: Merge K sorted linked lists
Difficulty: Hard
Link: https://www.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1

Description:
Given an array of K sorted linked lists, merge all the linked lists into a single sorted list.

Time Complexity: O(N * log K)
Space Complexity: O(K)
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        if (arr == null || arr.length == 0) return null;
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        for (Node head : arr) {
            if (head != null) pq.add(head);
        }

        Node dummy = new Node(0);
        Node tail = dummy;

        while (!pq.isEmpty()) {
            Node minNode = pq.poll();
            tail.next = minNode;
            tail = tail.next;
            if (minNode.next != null) {
                pq.add(minNode.next);
            }
        }
        return dummy.next;
    }
}
