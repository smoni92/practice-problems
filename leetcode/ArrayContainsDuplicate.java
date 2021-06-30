package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length <= 1) {
            return false;
        }

        Set<Integer> numSet = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length; i++) {
            if(numSet.contains(nums[i])) {
                return true;
            }
            numSet.add(nums[i]);
        }
        return false;
    }

    public static boolean containsDuplicateImproved(int[] nums) {
        if(nums.length <= 1) {
            return false;
        }

        Arrays.sort(nums);
        for(int i = 1 ; i < nums.length; i++) {
            if(nums[i-1] == nums[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicateImproved(nums));

        int nums1[] = {1,2,1,4};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicateImproved(nums1));
    }

}
