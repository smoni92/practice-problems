package leetcode;

import java.util.HashSet;
import java.util.Set;

public class StringContainsBinaryCodesK {

    public boolean hasAllCodes(String s, int k) {

        Set<String> binaryCodes = new HashSet<>();
        for(int i = 0 ; i < s.length() - k + 1; i++) {
            String sub = s.substring(i, i+k);
            if(!binaryCodes.contains(sub)) {
                binaryCodes.add(sub);
                if(binaryCodes.size() == Math.pow(2, k)) {
                    return true;
                }
            }
        }

        return false;
    }
}
