package concepts;

public class RegExTest {

    public static void main(String[] args) {

        String url = "http://google.com";
        String[] urlTokens = url.trim().split(":\\*$", 2);

        System.out.println("URL Tokens: ");
        for(String urlToken: urlTokens) {
            System.out.println(urlToken);
        }
        String urlToken0 = urlTokens[0];
        boolean isWildcardPort = urlTokens.length == 2;

        System.out.println();
        System.out.println("Token0 : " + urlToken0 + " Is WildcardPort: " + isWildcardPort);
    }

}
