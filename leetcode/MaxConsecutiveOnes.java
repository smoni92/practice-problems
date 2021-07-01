package leetcode;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        int[] nums = {1};
        System.out.println(findMaxConsecutiveOnes(nums));

        int[] nums2 = {0};
        System.out.println(findMaxConsecutiveOnes(nums2));

        int[] nums3 = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(nums3));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxWindow = 0, currWindow = 0;
        for (int num : nums) {
            if (num == 0) {
                currWindow = 0;
            } else {
                currWindow++;
                maxWindow = Math.max(currWindow, maxWindow);
            }
        }
        return maxWindow;
    }
}
