
// Problem:-ConvertBinaryTreeIntoMirrorTree

// Solution:-
/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {

    void mirror(Node node) {

        if (node == null)
            return;

        // swap left and right
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        // recurse on children
        mirror(node.left);
        mirror(node.right);
    }
}