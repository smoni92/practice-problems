package leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        System.out.println(Arrays.toString(plusOne(digits)));

        System.out.println(Arrays.toString(plusOne2(digits)));
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

    public static int[] plusOne2(int[] digits) {

        int carryForward = 1;
        for(int i=digits.length - 1; i >= 0 ; i--) {
            digits[i] = digits[i] + carryForward;
            carryForward = digits[i] > 9 ? 1 : 0;
            digits[i] = digits[i] > 9 ? digits[i] % 10 : digits[i];
        }

        int[] result;
        if(carryForward > 0) {
            result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = carryForward;
        } else {
            result = digits;
        }
        return result;
    }
}
