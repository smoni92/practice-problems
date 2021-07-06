package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class ReduceArraySizeToHalf {

    public int minSetSize(int[] arr) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num : arr) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> sortedMap = numsMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int currentSize = arr.length;
        int minSize = 0;
        Iterator<Map.Entry<Integer, Integer>> numsIterator = sortedMap.entrySet().iterator();
        while (numsIterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = numsIterator.next();
            if (currentSize > (arr.length / 2)) {
                currentSize -= entry.getValue();
                numsIterator.remove();
                minSize += 1;
            } else {
                break;
            }
        }
        return minSize;
    }

    public int minSetSize2(int[] arr) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num : arr) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedList = numsMap.values().stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int currentSize = arr.length;
        int minSize = 0;
        Iterator<Integer> numsIterator = sortedList.iterator();
        while (numsIterator.hasNext()) {
            Integer num = numsIterator.next();
            if (currentSize > (arr.length / 2)) {
                currentSize -= num;
                numsIterator.remove();
                minSize += 1;
            } else {
                break;
            }
        }
        return minSize;
    }

    public static void main(String[] args) {

        ReduceArraySizeToHalf reduceArraySizeToHalf = new ReduceArraySizeToHalf();

        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        System.out.println(reduceArraySizeToHalf.minSetSize(arr));
        System.out.println(reduceArraySizeToHalf.minSetSize2(arr));

        int[] arr2 = {7, 7, 7, 7, 7, 7, 7};
        System.out.println(reduceArraySizeToHalf.minSetSize(arr2));
        System.out.println(reduceArraySizeToHalf.minSetSize2(arr2));
    }
}
