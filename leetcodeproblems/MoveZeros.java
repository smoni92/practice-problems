package leetcodeproblems;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {

        int currIndex = 0, zeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                currIndex = i;
                if (zeroIndex != -1 && zeroIndex < currIndex) {
                    nums[zeroIndex] = nums[currIndex];
                    nums[currIndex] = 0;
                    zeroIndex++;
                }
            } else {
                if (zeroIndex == -1) {
                    zeroIndex = i;
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
