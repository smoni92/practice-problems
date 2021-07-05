package leetcode;

public class LongestContiguous1sAnd0s {

    public boolean checkZeroOnes(String s) {
        int longestZeros = 0;
        int currentZeros = 0;
        int longestOnes = 0;
        int currentOnes = 0;

        char[] sArr = s.toCharArray();
        for (char ch : sArr) {
            if (ch == '0') {
                longestZeros = Math.max(longestZeros, ++currentZeros);
                currentOnes = 0;
            } else {
                longestOnes = Math.max(longestOnes, ++currentOnes);
                currentZeros = 0;
            }
        }
        return longestOnes > longestZeros;
    }

    public static void main(String[] args) {
        LongestContiguous1sAnd0s longestContiguous1sAnd0s = new LongestContiguous1sAnd0s();
        System.out.println(longestContiguous1sAnd0s.checkZeroOnes("1101"));
        System.out.println(longestContiguous1sAnd0s.checkZeroOnes("111000"));
    }
}
