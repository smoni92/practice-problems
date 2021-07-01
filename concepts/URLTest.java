package concepts;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

    /** Output:
     * URL http://google.com is valid
     * URL http://index.html is valid
     * java.net.MalformedURLException: no protocol: /index.html
     * java.net.MalformedURLException: unknown protocol: t3
     */
    public static void main(String[] args) {

        String[] urlStrings = {"http://google.com",
                "/index.html",
                "t3://hostname:7001",
                "http://index.html"};
        for (String urlString : urlStrings) {
            try {
                getIsURLValid(urlString);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void getIsURLValid(String urlString) throws MalformedURLException {

        URL url = new URL(urlString);
        System.out.println("URL " + url + " is valid");
    }
}
