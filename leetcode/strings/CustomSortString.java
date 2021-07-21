package leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class CustomSortString {

    public String customSortString(String order, String str) {
        if (str == null) {
            return null;
        }

        char[] result = new char[str.length()];
        List<Character> strChars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            strChars.add(ch);
        }

        int index = 0;
        for (int i = 0; i < order.length(); i++) {
            while (strChars.contains(order.charAt(i))) {
                result[index++] = order.charAt(i);
                strChars.remove(strChars.indexOf(order.charAt(i)));
            }
        }

        for (Character ch : strChars) {
            result[index++] = ch;
        }
        return new String(result);
    }

    public static void main(String[] args) {
        CustomSortString customSortString = new CustomSortString();
        System.out.println(customSortString.customSortString("cba", "abcd"));
        System.out.println(customSortString.customSortString("kqep", "pekeq"));
    }
}
