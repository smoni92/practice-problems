package leetcode.strings;

public class AddBinaryString {

    public static void main(String[] args) {

        System.out.println("Test 1");
        String a = "1010";
        String b = "1011";

        String expectedResult = "10101";
        String result  = addBinary(a, b);

        System.out.println(result);
        System.out.println(result.equalsIgnoreCase(expectedResult));

        System.out.println();
        System.out.println("Test 2");
        a = "11";
        b = "1";
        expectedResult = "100";
        result  = addBinary(a, b);

        System.out.println(result);
        System.out.println(result.equalsIgnoreCase(expectedResult));

        System.out.println();
        System.out.println("Test 3");
        a = "1111";
        b = "1111";
        expectedResult = "11110";
        result  = addBinary(a, b);

        System.out.println(result);
        System.out.println(result.equalsIgnoreCase(expectedResult));

    }

    //Parse both strings as char array from last to first element, sum and keep adding it to result. If the result is 10 carry forward.
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        int carry = 0;
        for (int i = aArray.length - 1, j = bArray.length - 1; i >= 0 || j >= 0; i--, j--) {
            if (i >= 0 && j >= 0) {
                int aArrVal = aArray[i] - '0';
                int bArrVal = bArray[j] - '0';
                int sum = (aArrVal + bArrVal + carry);
                if (sum == 2) {
                    result.append(0);
                    carry = 1;
                } else if (sum == 3) {
                    result.append(1);
                    carry = 1;
                } else {
                    result.append(aArrVal + bArrVal + carry);
                    carry = 0;
                }
            } else if (i > j) {
                int aArrVal = aArray[i] - '0';
                if ((aArrVal + carry) > 1) {
                    result.append(0);
                    carry = 1;
                } else {
                    result.append(aArrVal + carry);
                    carry = 0;
                }
            } else {
                int bArrVal = bArray[j] - '0';
                if ((bArrVal + carry) > 1) {
                    result.append(0);
                    carry = 1;
                } else {
                    result.append(bArrVal + carry);
                    carry = 0;
                }
            }
        }

        if (carry == 1) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
