package leetcode.misc;

public class NumberOf1Bits {

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {

        int n = -3;
        System.out.println(hammingWeight(n));

        int n1 = 11;
        System.out.println(hammingWeight(n1));

    }
}
