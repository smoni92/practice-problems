package concepts;

public class StringTest {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        String str = new String();
        System.out.println("String isNull : " + (str == null) + " isEmpty: " + str.isEmpty());

        System.out.println("Lowercase String: " + str.toLowerCase());

        String URL = "example.com";
        String Operation = "Update";
        String concatString = "UpdateCommand(Name=\"" + URL + "\", Value=\"" + URL + "\", Operation=\"" + Operation + "\")";

        System.out.println("Final Value : " + concatString);
    }
}
