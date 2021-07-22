package concepts;

import java.util.Arrays;

public class ArrayComparisionTest {

    public boolean compareArrays(String[] actual, String[] expected) {
        String[] actualParsed = Arrays.stream(actual).map(String::trim).sorted().toArray(String[]::new);
        String[] expectedParsed = Arrays.stream(expected).map(String::trim).sorted().toArray(String[]::new);
        return Arrays.deepEquals(actualParsed, expectedParsed);
    }

    public static void main(String[] args) {

        ArrayComparisionTest arrayComparisionTest = new ArrayComparisionTest();

        String actual = "EMAILADDRESS=abc@email.com, CN=master, OU=OU, O=ORG, L=BNG, ST=KA, C=IN";
        String expected = "EMAILADDRESS=abc@email.com, CN=master, OU=OU, O=ORG, L=BNG, ST=KA, C=IN";

        System.out.println(arrayComparisionTest.compareArrays(actual.split(","), expected.split(",")));

        actual = "CN=master, OU=OU, O=ORG, L=BNG, ST=KA, C=IN, EMAILADDRESS=abc@email.com";
        expected = "EMAILADDRESS=abc@email.com, CN=master, OU=OU, O=ORG, L=BNG, ST=KA, C=IN";

        System.out.println(arrayComparisionTest.compareArrays(actual.split(","), expected.split(",")));
    }
}
