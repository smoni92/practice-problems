package leetcode.arrays;

public class MinPartitions {

    public int minPartitions(String n) {
        return n.chars().max().getAsInt() - '0';
    }

    public int minPartitions2(String n) {
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0 ; i < n.length(); i++) {
            if(n.charAt(i)  == '9') {
                return 9;
            }
            int currentMax = n.charAt(i) - '0';
            if(maxValue < currentMax) {
                maxValue = currentMax;
            }
        }

        return maxValue;
    }
}
