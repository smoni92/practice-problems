package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCasePermutation {

    public static List<String> letterCasePermutation(String S) {
        if (S == null) {
            return new ArrayList<>();
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(S);

        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i)))
                continue;

            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String currString = queue.poll();
                if (currString == null) {
                    break;
                }
                char[] currArr = currString.toCharArray();

                currArr[i] = Character.toUpperCase(currArr[i]);
                queue.offer(String.valueOf(currArr));

                currArr[i] = Character.toLowerCase(currArr[i]);
                queue.offer(String.valueOf(currArr));
            }
        }

        return new LinkedList<>(queue);
    }

    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1B1"));
    }
}
