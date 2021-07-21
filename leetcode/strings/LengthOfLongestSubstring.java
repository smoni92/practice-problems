package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int max = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for (int rightPointer = 0, leftPointer = 0; rightPointer < s.length(); rightPointer++) {
            while (charMap.containsKey(s.charAt(rightPointer))) {
                charMap.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            charMap.put(s.charAt(rightPointer), rightPointer);
            max = Math.max(max, rightPointer - leftPointer + 1);
        }
        return max;
    }

    public static void main(String[] args) {

        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcba"));
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("dvdf"));
    }
}
