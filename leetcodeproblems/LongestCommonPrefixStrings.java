package leetcodeproblems;

import java.util.Arrays;

public class LongestCommonPrefixStrings {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        Arrays.sort(strs);

        String first = strs[0].length() < strs[strs.length - 1].length() ? strs[0] : strs[strs.length - 1];
        String second = strs[0].length() < strs[strs.length - 1].length() ? strs[strs.length - 1] : strs[0];

        int min = Math.min(first.length(), second.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            if (first.charAt(i) == second.charAt(i)) {
                sb.append(first.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Result : " + longestCommonPrefix(strs));

        strs = new String[]{"reflower", "flow", "flower"};
        System.out.println("Result : " + longestCommonPrefix(strs));
    }

}
