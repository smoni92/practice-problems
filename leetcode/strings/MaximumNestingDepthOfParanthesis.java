package leetcode.strings;

public class MaximumNestingDepthOfParanthesis {

    public static void main(String[] args) {

        String input = "((((X)(Y))((Z)))";
        System.out.println(maxDepth(input));
    }

    public static int maxDepth (String s) {
        char[] sArray = s.toCharArray();
        int curr_count = 0, max_count = 0;
        for(char sChar : sArray) {
            if(sChar == '(') {
                curr_count++;
                if(curr_count > max_count) {
                    max_count = curr_count;
                }
            } else if(sChar == ')') {
                if(curr_count < 0) {
                    return -1;
                }
                curr_count--;
            }
        }
        return max_count;
    }
}
