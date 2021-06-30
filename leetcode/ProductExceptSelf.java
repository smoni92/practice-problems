package leetcode;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        leftProduct[0] = 1;
        for(int i=1; i< nums.length; i++) {
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
        }

        rightProduct[nums.length-1] = 1;
        for(int i=nums.length-2; i >=0; i--) {
            rightProduct[i] = rightProduct[i+1] * nums[i+1];
        }

        int[] output = new int[nums.length];
        for(int i=0; i< nums.length; i++) {
            output[i] = leftProduct[i] * rightProduct[i];
        }

        return output;
    }
}
