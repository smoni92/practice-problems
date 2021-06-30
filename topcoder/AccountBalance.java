package topcoder;

public class AccountBalance {

    public int processTransactions(int startingBalance, String[] transactions) {
        int finalAmount = startingBalance;
        for (int i = 0; i < transactions.length; i++) {
            char type = transactions[i].charAt(0);
            int currentAmount = Integer.parseInt(transactions[i].substring(2));
            if (type == 'C') {
                finalAmount += currentAmount;
            } else {
                finalAmount -= currentAmount;
            }
        }
        return finalAmount;
    }

}
