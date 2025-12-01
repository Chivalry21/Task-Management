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
