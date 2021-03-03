package leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

public class KPalindromeStrings {

    public static boolean canConstruct(String s, int k) {

        int len = s.length();
        if (len < k) {
            return false;
        } else if (len == k) {
            return true;
        }

        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character charS = s.charAt(i);
            if (charMap.containsKey(charS)) {
                int count = charMap.get(charS);
                charMap.put(charS, count + 1);
            } else {
                charMap.put(charS, 1);
            }
        }

        if (charMap.size() == 1 || charMap.size() == k) {
            return true;
        }

        int count = 0;
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                count++;
            }
        }

        if (count <= k) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("annabelle", 2));
        System.out.println(canConstruct("messi", 3));
        System.out.println(canConstruct("true", 4));
        System.out.println(canConstruct("leetcode", 3));
        System.out.println(canConstruct("aaa", 2));
        System.out.println(canConstruct("qlkzenwmmnpkopu", 15));
        System.out.println(canConstruct("ibzkwaxxaggkiwjbeysz", 15));
        System.out.println(canConstruct("cxayrgpcctwlfupgzirmazszgfiusitvzsnngmivctprcotcuutfxdpbrdlqukhxkrmpwqqwdxxrptaftpnilfzcmknqljgbfkzuhksxzplpoozablefndimqnffrqfwgaixsovmmilicjwhppikryerkdidupvzdmoejzczkbdpfqkgpbxcrxphhnxfazovxbvaxyxhgqxcxirjsryqxtreptusvupsstylpjniezyfokbowpbgxbtsemzsvqzkbrhkvzyogkuztgfmrprz", 5));
    }
}
