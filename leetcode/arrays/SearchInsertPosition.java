package leetcode.arrays;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int result = -1;
        for (int left = 0, right = nums.length - 1; left <= right; ) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                result = mid;
                break;
            } else {
                if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                result = left;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 5;

        System.out.println(searchInsert(nums, target));

        nums = new int[]{1, 3, 5, 6};
        target = 2;

        System.out.println(searchInsert(nums, target));

        nums = new int[]{1, 3, 5, 6};
        target = 7;

        System.out.println(searchInsert(nums, target));
    }
}
