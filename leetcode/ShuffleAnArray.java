package leetcode;

import java.util.Arrays;
import java.util.Random;

public class ShuffleAnArray {

    private int[] orgNums;
    private Random random = new Random();

    public ShuffleAnArray(int[] nums) {
        this.orgNums = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return orgNums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int[] nums = new int[orgNums.length];
        System.arraycopy(orgNums, 0, nums, 0, nums.length);
        for (int i = 0; i < orgNums.length; i++) {
            swap(nums, random.nextInt(i + 1), i);
        }
        return nums;
    }

    private void swap(int[] nums, int nextInt, int i) {
        int temp = nums[nextInt];
        nums[nextInt] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ShuffleAnArray shuffleAnArray = new ShuffleAnArray(nums);
        System.out.println(Arrays.toString(shuffleAnArray.shuffle()));
        System.out.println(Arrays.toString(shuffleAnArray.reset()));
        System.out.println(Arrays.toString(shuffleAnArray.shuffle()));
    }
}
