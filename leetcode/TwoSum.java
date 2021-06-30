package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(numsMap.containsKey(diff) && numsMap.get(diff) != i) {
                indices[0] = i;
                indices[1] = numsMap.get(diff);
                break;
            }
        }
        return indices;
    }

    public static void main(String[] args) {

        int nums[] = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
