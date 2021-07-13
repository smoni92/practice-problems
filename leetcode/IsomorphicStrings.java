package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        //Tracks character mapping from s to t
        Map<Character, Character> charMapping = new HashMap<>();
        //Keeps track of values in t to check for duplicates in character mapping. e.g. t-> n a-> n
        Set<Character> charValues = new HashSet<>();

        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charMapping.containsKey(s.charAt(i))) {
                if (charMapping.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                //Character is first seen in s. Check if the corresponding mapping is already seen in t.
                if (charValues.contains(t.charAt(i))) {
                    return false;
                } else {
                    charMapping.put(s.charAt(i), t.charAt(i));
                    charValues.add(t.charAt(i));
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        System.out.println(isomorphicStrings.isIsomorphic("paper", "title"));
        System.out.println(isomorphicStrings.isIsomorphic("foo", "add"));
        System.out.println(isomorphicStrings.isIsomorphic("foo", "bar"));
    }
}
