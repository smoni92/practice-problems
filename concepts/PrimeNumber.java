package concepts;

import java.util.Arrays;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        } else {
            int m = (int) Math.sqrt(num);
            for (int i = 3; i <= m; i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * The Sieve of Eratosthenes will generate all the primes from 2 to a given number n. It begins by assuming that all numbers are prime. It then takes the first prime number and removes all of its multiples. It then applies the same method to the next prime number. This is continued until all numbers have been processed.
     * The outer loop finds the next prime while the inner loop removes all the multiples of the current prime.
     * @param num
     * @return
     */
    public static boolean isPrimeSieveMethod(int num) {
        boolean[] prime = new boolean[num + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        int m = (int) Math.sqrt(num);
        for (int i = 2; i <= m; i++) {
            if (prime[i]) {
                for (int k = i * i; k <= num; k += i) {
                    prime[k] = false;
                }
            }
        }

        return prime[num];
    }

    public static void main(String[] args) {

        System.out.println("Normal Method - Optimized");
        long startTime = System.currentTimeMillis();
        System.out.println("Is 2 Prime : " + isPrime(2));
        System.out.println("Is 1 Prime : " + isPrime(1));
        System.out.println("Is 5 Prime : " + isPrime(5));
        System.out.println("Is 501 Prime : " + isPrime(501));
        System.out.println("Is 503 Prime : " + isPrime(503));
        System.out.println("Running time is : " + (System.currentTimeMillis() - startTime) + " ms");

        System.out.println();
        System.out.println("Sieve Method - Optimized");
        startTime = System.currentTimeMillis();
        System.out.println("Is 2 Prime : " + isPrimeSieveMethod(2));
        System.out.println("Is 1 Prime : " + isPrimeSieveMethod(1));
        System.out.println("Is 5 Prime : " + isPrimeSieveMethod(5));
        System.out.println("Is 501 Prime : " + isPrimeSieveMethod(501));
        System.out.println("Is 503 Prime : " + isPrimeSieveMethod(503));
        System.out.println("Running time is : " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
