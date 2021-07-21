package leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfArithmeticSlices {

    public static int numberOfArithmeticSlices(int[] A) {

        int slices = 0;
        if (A.length < 3) {
            return slices;
        }

        Map<Integer, List<Integer>> countMap = new HashMap<Integer, List<Integer>>();
        int prevDiff = -1;
        for (int i = 0; i < A.length - 1; i++) {
            int diff = A[i + 1] - A[i];
            if (countMap.containsKey(diff)) {
                List<Integer> currList = countMap.get(diff);
                if (prevDiff == diff) {
                    int currItem = currList.remove(currList.size() - 1);
                    currList.add(currItem + 1);
                } else {
                    currList.add(1);
                    prevDiff = diff;
                }
                countMap.put(diff, currList);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                countMap.put(diff, list);
                prevDiff = diff;
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : countMap.entrySet()) {
            List<Integer> list = entry.getValue();
            for (int i = 0; i < list.size(); i++) {
                int num = list.get(i);
                if (num >= 2) {
                    num--;
                    slices += ((num * (num + 1)) / 2);
                }
            }
        }
        return slices;
    }

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 8, 9, 10};
        System.out.println(numberOfArithmeticSlices(A));

        A = new int[]{1, 3, 5, 7, 11, 15, 19};
        System.out.println(numberOfArithmeticSlices(A));

    }
}
