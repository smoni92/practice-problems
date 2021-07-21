package leetcode.misc;

public class Maximum69Number {

    public static int maximum69Number(int num) {
        return Integer.parseInt(String.valueOf(num).replaceFirst("6","9"));
    }

    public static void main(String[] args) {
        int result = maximum69Number(6699);
        System.out.println("Result :" + result);
    }

}
