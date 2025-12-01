package com.chioma.taskmangement.dsa;

import java.util.HashMap;
import java.util.Map;

public class Assessment {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        int left = 0;
        int max = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();
        for(int right = 0; right <s.length(); right++) {
            char currentChar = s.charAt(right);
            if(lastSeen.containsKey(currentChar) && lastSeen.get(currentChar) >= left) {
                left = lastSeen.get(currentChar);
            }
            lastSeen.put(currentChar, right);
            max = Math.max(max, right - left +1);
        }
        return max;
    }
}
/*... Question
DSA Assessment: Find the Longest Substring Without Repeating
Characters
Task: Given a string s, find the length of the longest substring without repeating characters.
Example:
1. Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
2. Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
3. Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Constraints:
● The input string s consists of English letters, digits, symbols, and spaces.
● The function should have O(n) time complexity.
Requirements:
Method Signature:
public int lengthOfLongestSubstring(String s)
Bonus:
● Handle edge cases like an empty string or a string with all unique characters.
● Optimize space complexity to use O(min(n, m)), where n is the size of the input string
and m is the character set size.
 */
