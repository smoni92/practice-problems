package leetcode;

public class ReverseIntDigits {

    public static int reverse(int x) {
        String ans = null;
        if (x < 0) {
            ans = new StringBuilder(String.valueOf(-x)).append("-").reverse().toString();
        } else {
            ans = new StringBuilder(String.valueOf(x)).reverse().toString();
        }
        try {
            return Integer.parseInt(ans);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int reverseImproved(int x) {
        long ans = 0;
        while(x != 0) {
            int digit = x % 10;
            ans = ans * 10 + digit;
            x = x /10;
        }
        if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverseImproved(123));

        System.out.println(reverse(-56));
        System.out.println(reverseImproved(-56));

        System.out.println(reverse(0));
        System.out.println(reverseImproved(0));
    }
}
