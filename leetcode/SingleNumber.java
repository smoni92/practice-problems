package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!numMap.containsKey(num)) {
                numMap.put(num, 1);
            } else {
                int count = numMap.get(num);
                numMap.put(num, count + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        //syntax reasons - this will never be the case as its guaranteed there will be one single number.
        return 0;
    }

    public static int singleNumberImproved(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4, 4};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumberImproved(nums));
    }
}
