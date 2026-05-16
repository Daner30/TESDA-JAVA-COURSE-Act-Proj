package BankingApp;
import java.util.*;

public class Account {
    private String accountNumber; // phone number
    private String ownerName;
    private String password;
    private String pin;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountNumber, String ownerName, String dateOfBirth,
                   String password, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.password = password;
        this.pin = pin;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public boolean authenticate(String inputPassword, String inputPin) {
        return this.password.equals(inputPassword) && this.pin.equals(inputPin);
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount, accountNumber, null));
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount, accountNumber, null));
            return true;
        }
        return false;
    }

    public void addTransfer(double amount, String otherAccNum, boolean isSource) {
        if (isSource) {
            transactions.add(new Transaction("Transfer Out", amount, accountNumber, otherAccNum));
        } else {
            transactions.add(new Transaction("Transfer In", amount, otherAccNum, accountNumber));
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
