package topcoder;

public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String result = "";
        if(rights.length == 0)
            return result;

        for(int i = 0; i < rights.length; i++) {
            if(rights[i] < minPermission) {
                result += 'D';
            } else {
                result += 'A';
            }
        }
        return result;
    }
}
