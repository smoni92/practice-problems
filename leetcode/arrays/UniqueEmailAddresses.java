package leetcode.arrays;

import java.util.HashSet;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        HashSet<String> nonUniqueEmails = new HashSet<>();
        for (String email : emails) {
            String localName = email.substring(0, email.indexOf('@'));
            String domainName = email.substring(email.indexOf('@'));
            if (localName.contains("+")) {
                localName = localName.substring(0, localName.indexOf('+'));
            }
            localName = localName.replaceAll("\\.", "");
            nonUniqueEmails.add(localName + domainName);
        }
        return nonUniqueEmails.size();
    }

    public static void main(String[] args) {

        UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();

        String[] emails = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        System.out.println(uniqueEmailAddresses.numUniqueEmails(emails));
    }
}
