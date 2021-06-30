package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

    public static int findLHS(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!numsMap.containsKey(num)) {
                numsMap.put(num, 1);
            } else {
                int count = numsMap.get(num);
                numsMap.put(num, count + 1);
            }
        }

        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (numsMap.containsKey(entry.getKey() + 1)) {
                int currentValue = entry.getValue() + numsMap.get(entry.getKey() + 1);
                if (currentValue > maxValue) {
                    maxValue = currentValue;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(findLHS(nums));
    }
}
