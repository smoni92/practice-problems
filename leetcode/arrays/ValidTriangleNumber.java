package leetcode.arrays;

import java.util.Arrays;

public class ValidTriangleNumber {

    public int triangleNumber(int[] nums) {
        int count = 0;
        if(nums.length < 3) {
            return count;
        }

        Arrays.sort(nums);
        int fixed = nums.length - 1;
        while (fixed >= 2) {
            for (int left = 0, right = fixed - 1; right > left; ) {
                if (nums[left] + nums[right] > nums[fixed]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
            fixed--;
        }
        return count;
    }

    public static void main(String[] args) {
        ValidTriangleNumber validTriangleNumber = new ValidTriangleNumber();

        int[] nums = {2, 2, 3, 4};
        System.out.println(validTriangleNumber.triangleNumber(nums));

        nums = new int[]{4, 2, 3, 4};
        System.out.println(validTriangleNumber.triangleNumber(nums));
    }
}
