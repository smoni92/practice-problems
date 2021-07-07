package leetcode;

import java.util.Arrays;

public class MinNoOfOperationsToMoveBalls {

    public int[] minOperations(String boxes) {
        if (boxes == null || boxes.isEmpty()) {
            return new int[1];
        }
        char[] boxChars = boxes.toCharArray();
        int[] forward = new int[boxChars.length];
        int[] back = new int[boxChars.length];

        int prev = boxChars[0] == '0' ? 0 : 1;
        for (int left = 1; left < boxChars.length; left++) {
            forward[left] = forward[left - 1] + prev;
            prev += boxChars[left] == '0' ? 0 : 1;
        }

        int next = boxChars[boxChars.length - 1] == '0' ? 0 : 1;
        for (int right = boxChars.length - 2; right >= 0; right--) {
            back[right] = back[right + 1] + next;
            next += boxChars[right] == '0' ? 0 : 1;
        }

        int[] result = new int[boxChars.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = forward[i] + back[i];
        }

        return result;
    }

    public static void main(String[] args) {

        MinNoOfOperationsToMoveBalls minNoOfOperationsToMoveBalls = new MinNoOfOperationsToMoveBalls();
        System.out.println(Arrays.toString(minNoOfOperationsToMoveBalls.minOperations("110")));
        System.out.println(Arrays.toString(minNoOfOperationsToMoveBalls.minOperations("001011")));
    }
}
