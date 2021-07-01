package concepts;

import java.util.Arrays;

public class BinarySearch {

    public boolean binarySearch(int[] list, int element) {

        System.out.println("Searching : " + element + " in List: " + Arrays.toString(list));
        int low = 0;
        int high = list.length - 1;
        int middle, guess;
        boolean result = false;

        while (low <= high) {
            middle = (low + high) / 2;
            guess = list[middle];

            if (element < guess) {
                System.out.println("Indices:: High: " + high + " Low: " + low +  " Middle: " + middle + " Guessed Element : " + guess + " Decreasing high...");
                high = middle - 1;

            } else if (element > guess) {
                System.out.println("Indices:: High: " + high + " Low: " + low +  " Middle: " + middle +  " Guessed Element : " + guess +  " Increasing Low...");
                low = middle + 1;

            } else {
                result = true;
                return result;

            }
        }

        return result;
    }

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int[] list = {1, 3, 5, 7, 9};
        System.out.println("Elements in List: " + Arrays.toString(list));

        System.out.println();
        boolean found3 = binarySearch.binarySearch(list, 3);
        System.out.println("Is Three Present in List: " + found3);

        System.out.println();
        boolean foundMinus1 = binarySearch.binarySearch(list, -1);
        System.out.println("Is Minus1 Present in List: " + foundMinus1);
    }
}
