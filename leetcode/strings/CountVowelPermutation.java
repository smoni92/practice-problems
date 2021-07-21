package leetcode.strings;

public class CountVowelPermutation {

    public static int countVowelPermutation(int n) {
        long result = 0;
        long[][] permutations = new long[n + 1][5];

        int mod = (int) (1e9 + 7);

        //vowels:: a: 0, e : 1, i : 2, o : 3, u : 4
        for (int vowels = 0; vowels < 5; vowels++) {
            permutations[1][vowels] = 1;
        }

        for (int len = 2; len <= n; len++) {
            permutations[len][0] = (permutations[len - 1][1] + permutations[len - 1][2] + permutations[len - 1][4]) % mod;
            permutations[len][1] = (permutations[len - 1][0] + permutations[len - 1][2]) % mod;
            permutations[len][2] = (permutations[len - 1][1] + permutations[len - 1][3]) % mod;
            permutations[len][3] = (permutations[len - 1][2]) % mod;
            permutations[len][4] = (permutations[len - 1][3] + permutations[len - 1][2]) % mod;
        }

        for (int vowels = 0; vowels < 5; vowels++) {
            result = (result + permutations[n][vowels]) % mod;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(countVowelPermutation(1));
        System.out.println(countVowelPermutation(2));
        System.out.println(countVowelPermutation(5));
        System.out.println(countVowelPermutation(144));
    }
}
