package leetcode;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {

        Set<Integer> uniqueCandies = new HashSet<>();
        for(int candy : candyType) {
            uniqueCandies.add(candy);
        }

        return Math.min(uniqueCandies.size(), candyType.length/2);
    }
}
