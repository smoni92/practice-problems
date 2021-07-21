package leetcode.arrays;

import java.util.*;

public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> numsMap = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!numsMap.contains(i + 1)) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers.findDisappearedNumbers(nums));

        nums = new int[]{1, 1};
        System.out.println(findDisappearedNumbers.findDisappearedNumbers(nums));
    }
}
