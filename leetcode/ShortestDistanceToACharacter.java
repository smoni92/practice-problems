package leetcode;

import java.util.Arrays;

public class ShortestDistanceToACharacter {

    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];
        int c_pos = -n;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                c_pos = i;
            }
            result[i] = i - c_pos;
        }

        for(int i = n-1; i >= 0; i--) {
            if(s.charAt(i) == c) {
                c_pos = i;
            }
            result[i] = Math.min(result[i], Math.abs(i - c_pos));
        }
        return result;
    }

    public static void main(String[] args) {

        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(shortestToChar(s, c)));
    }
}
