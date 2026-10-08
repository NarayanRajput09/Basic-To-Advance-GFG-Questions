package Stack_and_Queue;

import java.util.Stack;

/*
Problem: Parenthesis Checker
Difficulty: Easy
Link: https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1

Description:
Given an expression string x. Examine whether the pairs and the orders of "{","}","(",")","[","]" are correct.

Time Complexity: O(N)
Space Complexity: O(N)
*/

class Solution {
    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
