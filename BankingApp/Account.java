package BankingApp;
import java.util.*;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String pin;
    private List<Transaction> transactions; // personal history

    public Account(String accountNumber, String ownerName, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.pin = pin;
        this.transactions = new ArrayList<>();
    }

    public boolean authenticate(String inputPin) {
        return this.pin.equals(inputPin);
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
