package leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyNum {

    public static int findLucky(int[] arr) {

        Map<Integer, Integer> arrMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arrMap.containsKey(arr[i])) {
                int count = arrMap.get(arr[i]);
                arrMap.put(arr[i], count + 1);
            } else {
                arrMap.put(arr[i], 1);
            }
        }

        int luckyNum = -1;
        for (Map.Entry<Integer, Integer> entry : arrMap.entrySet()) {
            if (entry.getKey() == entry.getValue() && luckyNum < entry.getKey()) {
                luckyNum = entry.getKey();
            }
        }

        return luckyNum;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 4};
        System.out.println(findLucky(arr));
    }
}
