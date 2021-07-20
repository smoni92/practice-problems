package leetcode;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        if (nums.length < 3) {
            return new ArrayList<>(result);
        }

        Arrays.sort(nums);
        int fixed = 0;

        while (fixed < nums.length - 2) {
            if(nums[fixed] > 0) {
                break;
            }
            for (int right = fixed + 1; right <= nums.length - 1; right++) {
                for (int left = right + 1; left <= nums.length - 1; left++) {
                    int sum = nums[left] + nums[right] + nums[fixed];
                    if (sum == 0) {
                        List<Integer> sums = new ArrayList<>();
                        sums.add(nums[left]);
                        sums.add(nums[right]);
                        sums.add(nums[fixed]);

                        Collections.sort(sums);

                        result.add(sums);
                    } else if (sum > 0) {
                        break;
                    }
                }
            }
            fixed++;
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum.threeSum(nums));

        nums = new int[]{};
        System.out.println(threeSum.threeSum(nums));

        nums = new int[]{0};
        System.out.println(threeSum.threeSum(nums));

        nums = new int[]{-2, 0, 1, 1, 2};
        System.out.println(threeSum.threeSum(nums));

    }
}
