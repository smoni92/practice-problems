package leetcodeproblems;

import java.math.BigInteger;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {

        String digitString = "";
        for (int i = 0; i < digits.length; i++) {
            digitString = digitString + digits[i];
        }

        BigInteger outputDigit = new BigInteger(digitString);
        outputDigit = outputDigit.add(BigInteger.ONE);

        int[] result = String.valueOf(outputDigit).chars().map(c -> c - '0').toArray();
        return result;
    }
}
