package leetcodeproblems;

import java.util.*;

public class KWeakestRows {

    public static int[] kWeakestRows(int[][] mat, int k) {

        Map<Integer, List<Integer>> rowsMap = new TreeMap<Integer, List<Integer>>();
        for(int row = 0; row < mat.length; row++) {
            int count = 0;
            for(int i = 0; i < mat[row].length; i++) {
                if(mat[row][i] == 1) {
                    count++;
                } else {
                    break;
                }
            }

            List<Integer> rowList = new ArrayList<Integer>();
            if(rowsMap.containsKey(count)) {
                rowList  = rowsMap.get(count);
            }
            rowList.add(row);
            rowsMap.put(count, rowList);
        }

        int[] result = new int[k];
        int i = 0;
        for (Map.Entry<Integer, List<Integer>> entry : rowsMap.entrySet()) {
            List<Integer> list = entry.getValue();
            Iterator<Integer> iterator = list.iterator();
            while(iterator.hasNext() && i < k) {
                result[i] = iterator.next();
                i++;
            }
            if(i == k) {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0}, {1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;
        System.out.println(Arrays.toString(kWeakestRows(mat, k)));
    }
}
