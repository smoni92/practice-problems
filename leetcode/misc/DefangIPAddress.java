package leetcode.misc;

public class DefangIPAddress {

    public String defangIPAddress(String ipAddress) {

        //return ipAddress.replaceAll(".","[.]"));

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< ipAddress.length(); i++) {
            if(ipAddress.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(ipAddress.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String ipAddress = "1.1.1.1";
        DefangIPAddress defangIPAddress = new DefangIPAddress();
        System.out.println(defangIPAddress.defangIPAddress(ipAddress));
    }
}
