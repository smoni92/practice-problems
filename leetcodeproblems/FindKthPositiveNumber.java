package leetcodeproblems;

import java.util.Arrays;

public class FindKthPositiveNumber {

    public static int findKthPositive(int[] arr, int k) {

        int missingCounter = 0, i = 1;

        for (; missingCounter != k; i++) {
            if (!(Arrays.binarySearch(arr, i) >= 0))
                missingCounter++;
        }

        return i-1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
}
