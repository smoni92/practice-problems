package leetcode.arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, j = nums.length - 1, k = nums.length - 1; k >= 0 && i <= j; k--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[k] = (int) Math.pow(nums[i], 2);
                i++;
            } else {
                result[k] = (int) Math.pow(nums[j], 2);
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray sortedArray = new SquaresOfSortedArray();

        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedArray.sortedSquares(nums)));

        nums = new int[]{-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedArray.sortedSquares(nums)));
    }
}
