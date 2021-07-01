package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyNum {

    public static int findLucky(int[] arr) {

        Map<Integer, Integer> arrMap = new HashMap<>();
        for (int val : arr) {
            if (arrMap.containsKey(val)) {
                int count = arrMap.get(val);
                arrMap.put(val, count + 1);
            } else {
                arrMap.put(val, 1);
            }
        }

        int luckyNum = -1;
        for (Map.Entry<Integer, Integer> entry : arrMap.entrySet()) {
            if (entry.getKey().equals(entry.getValue()) && luckyNum < entry.getKey()) {
                luckyNum = entry.getKey();
            }
        }

        return luckyNum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        System.out.println(findLucky(arr));
    }
}
