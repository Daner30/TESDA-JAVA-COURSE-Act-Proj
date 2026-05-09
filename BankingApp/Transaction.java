package BankingApp;
import java.time.LocalDateTime;

public class Transaction {
    private String type;          // Deposit, Withdraw, Transfer In/Out
    private double amount;
    private String sourceAccount;
    private String destAccount;
    private LocalDateTime timestamp;

    public Transaction(String type, double amount, String sourceAccount, String destAccount) {
        this.type = type;
        this.amount = amount;
        this.sourceAccount = sourceAccount;
        this.destAccount = destAccount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        if (type.equalsIgnoreCase("Transfer Out")) {
            return timestamp + " | " + type + ": " + amount +
                   " to " + destAccount;
        } else if (type.equalsIgnoreCase("Transfer In")) {
            return timestamp + " | " + type + ": " + amount +
                   " from " + sourceAccount;
        } else {
            return timestamp + " | " + type + ": " + amount +
                   " on account " + sourceAccount;
        }
    }
}
