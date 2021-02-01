package leetcodeproblems;

public class LargestNoAtleastTwiceOfOthers {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0 ; i < nums.length; i++ ) {
            if(nums[i] > maxNumber) {
                maxNumber = nums[i];
                maxIndex = i;
            }
        }

        //System.out.println("MaxNumber: " + maxNumber +  " MaxIndex: " + maxIndex);

        for(int i = 0; i < nums.length; i++) {
            if(i != maxIndex && (2 * nums[i] > maxNumber)) {
                maxIndex = -1;
                break;
            }
        }
        return maxIndex;
    }
}
