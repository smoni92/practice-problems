package concepts;

public class UnsignedRightShift {

    public static void main(String[] args) {

        int low = 0, high = 7;
        int mid1 = (low + high) / 2;
        int mid2 = (low + high) >>> 1;
        System.out.println("Mid 1: " + mid1 + " Mid 2: " + mid2);

        low = 0;
        high = 8;
        mid1 = (low + high) / 2;
        mid2 = (low + high) >>> 1;
        System.out.println("Mid 1: " + mid1 + " Mid 2: " + mid2);
    }
}
