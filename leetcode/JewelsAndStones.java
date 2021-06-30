package leetcode;

public class JewelsAndStones {

    public static void main(String[] args) {

        System.out.println("Result: " + numJewelsInStones("aA","aAAbbbb"));
    }

    public static int numJewelsInStones(String J, String S) {

        int count = 0;
        for(Character sChar : S.toCharArray()) {
            if(J.indexOf(sChar) >= 0) {
                count++;
            }
        }

        return count;
    }
}
