package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/*
Problem: Word Ladder I
Difficulty: Hard
Link: https://www.geeksforgeeks.org/problems/word-ladder/1

Description:
Given two distinct words startWord and targetWord, and a list denoted by wordList of unique words of equal lengths. Find the length of the shortest transformation sequence from startWord to targetWord.

Time Complexity: O(N * M * 26)
Space Complexity: O(N * M)
*/

class Pair {
    String word;
    int steps;
    Pair(String w, int s) {
        this.word = w;
        this.steps = s;
    }
}

class Solution {
    public int wordLadderLength(String startWord, String targetWord, String[] wordList) {
        HashSet<String> dict = new HashSet<>();
        for (String w : wordList) dict.add(w);

        if (!dict.contains(targetWord)) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startWord, 1));
        dict.remove(startWord);

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            String word = curr.word;
            int steps = curr.steps;

            if (word.equals(targetWord)) return steps;

            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char original = chars[i];
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    chars[i] = ch;
                    String newWord = new String(chars);
                    if (dict.contains(newWord)) {
                        dict.remove(newWord);
                        q.add(new Pair(newWord, steps + 1));
                    }
                }
                chars[i] = original;
            }
        }
        return 0;
    }
}
