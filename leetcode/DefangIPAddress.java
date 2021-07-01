package leetcode;

public class DefangIPAddress {

    public static void main(String[] args) {

        String IPAddress = "1.1.1.1";
        //System.out.println(IPAddress.replaceAll(".","[.]"));

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< IPAddress.length(); i++) {
            if(IPAddress.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(IPAddress.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
