package leetcodeproblems;

import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {

    public static void main(String[] args) {

        int[] nums = {8,1,2,2,3};
        System.out.println("Result: " + Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    result[i]++;
                }
            }
        }
        return result;
    }
}
