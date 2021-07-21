package leetcode.arrays;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sortedMap = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if (sortedMap.containsKey(sorted)) {
                sortedMap.get(sorted).add(str);
            } else {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(str);
                sortedMap.put(sorted, anagramList);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : sortedMap.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams.groupAnagrams(strs));

        strs = new String[]{""};
        System.out.println(groupAnagrams.groupAnagrams(strs));

        strs = new String[]{"a"};
        System.out.println(groupAnagrams.groupAnagrams(strs));
    }
}
