package codechef;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class XOREngine {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 0; t < T; t++) {

            int N = in.nextInt();
            int Q = in.nextInt();
            in.nextLine();
            String AString = in.nextLine();
            BigInteger[] P = new BigInteger[Q];

            String[] A = AString.split(" ");
            BigInteger Ai, xorValue;
            int bitCount, key;
            Map<Integer, Integer> resultMap = new HashMap<>(0);

            for(int i = 0 ; i< Q; i++) {
                P[i] = BigInteger.valueOf(Long.parseLong(in.nextLine()));

                for(int j = 0 ; j < N; j++) {
                    Ai = BigInteger.valueOf(Long.parseLong(A[j]));

                    xorValue = Ai.xor(P[i]);
                    bitCount = xorValue.bitCount();

                    if(bitCount % 2 == 0) {
                        key = 1;
                    } else {
                        key = 2;
                    }
                    int count = resultMap.getOrDefault(key, 0);
                    resultMap.put(key, count+1);
                }

                System.out.println(resultMap.get(1) + "  " + resultMap.get(2));
            }
        }
    }
}
