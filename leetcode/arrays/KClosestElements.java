package leetcode.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KClosestElements {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        // Convert from array to list first to make use of Collections.sort()
        List<Integer> sortedArr = new ArrayList<Integer>();
        for (int num : arr) {
            sortedArr.add(num);
        }

        // Sort using custom comparator
        sortedArr.sort(Comparator.comparingInt(num -> Math.abs(num - x)));

        // Only take k elements
        sortedArr = sortedArr.subList(0, k);

        // Sort again to have output in ascending order
        sortedArr.sort(null);
        return sortedArr;
    }
}
