package leetcode.arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {

        int zeroIndex = -1;
        for (int currIndex = 0; currIndex < nums.length; currIndex++) {
            if (nums[currIndex] != 0) {
                if (zeroIndex != -1 && zeroIndex < currIndex) {
                    nums[zeroIndex] = nums[currIndex];
                    nums[currIndex] = 0;
                    zeroIndex++;
                }
            } else {
                if (zeroIndex == -1) {
                    zeroIndex = currIndex;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
