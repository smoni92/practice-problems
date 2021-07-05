package leetcode;

public class ContiguousSequenceOfOnes {

    public boolean checkOnesSegment(String s) {
        int longestOnes = 0;
        int currentOnes = 0;
        boolean foundOne = false;

        char[] sArr = s.toCharArray();
        for (char ch : sArr) {
            if (ch == '1') {
                if (foundOne) {
                    return false;
                }
                longestOnes = Math.max(longestOnes, ++currentOnes);
            } else {
                if (longestOnes > 0) {
                    foundOne = true;
                }
                currentOnes = 0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ContiguousSequenceOfOnes contiguousSequenceOfOnes = new ContiguousSequenceOfOnes();
        System.out.println(contiguousSequenceOfOnes.checkOnesSegment("1001"));
        System.out.println(contiguousSequenceOfOnes.checkOnesSegment("110"));
    }
}
