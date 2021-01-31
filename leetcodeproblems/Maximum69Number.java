package leetcodeproblems;

public class Maximum69Number {

    public static void main(String[] args) {
        int result = maximum69Number(6699);
        System.out.println("Result :" + result);
    }

    public static int maximum69Number(int num) {

        return Integer.valueOf(String.valueOf(num).replaceFirst("6","9"));
    }
}
