package BankingApp;
import java.util.*;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    // Create a new account
    public void createAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();

        if (accounts.containsKey(accNum)) {
            System.out.println("Account already exists!");
            return;
        }

        System.out.print("Enter owner name: ");
        String owner = scanner.nextLine();

        System.out.print("Enter initial deposit: ");
        double deposit = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Set a PIN: ");
        String pin = scanner.nextLine();

        Account newAcc = new Account(accNum, owner, deposit, pin);
        accounts.put(accNum, newAcc);
        System.out.println("Account created successfully!");
    }

    // Deposit money
    public void deposit(Scanner scanner) {
        Account acc = authenticate(scanner);
        if (acc == null) return;

        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        acc.deposit(amount);
        System.out.println("Deposit successful. New balance: " + acc.getBalance());
    }

    // Withdraw money
    public void withdraw(Scanner scanner) {
        Account acc = authenticate(scanner);
        if (acc == null) return;

        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (acc.withdraw(amount)) {
            System.out.println("Withdrawal successful. New balance: " + acc.getBalance());
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Transfer money between accounts
    public void transfer(Scanner scanner) {
        System.out.print("Enter source account number: ");
        String sourceAccNum = scanner.nextLine();
        Account sourceAcc = accounts.get(sourceAccNum);

        if (sourceAcc == null) {
            System.out.println("Source account not found!");
            return;
        }

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();
        if (!sourceAcc.authenticate(pin)) {
            System.out.println("Authentication failed!");
            return;
        }

        System.out.print("Enter destination account number: ");
        String destAccNum = scanner.nextLine();
        Account destAcc = accounts.get(destAccNum);

        if (destAcc == null) {
            System.out.println("Destination account not found!");
            return;
        }

        System.out.print("Enter transfer amount: ");
        double amount = scanner.nextDouble();

        if (sourceAcc.withdraw(amount)) {
            destAcc.deposit(amount);
            sourceAcc.addTransfer(amount, destAccNum, true);
            destAcc.addTransfer(amount, sourceAccNum, false);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Check balance
    public void checkBalance(Scanner scanner) {
        Account acc = authenticate(scanner);
        if (acc != null) {
            System.out.println("Account Balance: " + acc.getBalance());
        }
    }

    // Show transaction history for one account
    public void showAccountTransactions(Scanner scanner) {
        Account acc = authenticate(scanner);
        if (acc != null) {
            System.out.println("\n=== Transaction History for " + acc.getOwnerName() + " ===");
            if (acc.getTransactions().isEmpty()) {
                System.out.println("No transactions yet.");
            } else {
                for (Transaction t : acc.getTransactions()) {
                    System.out.println(t);
                }
            }
        }
    }

    // Helper: authenticate account by number + PIN
    private Account authenticate(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        Account acc = accounts.get(accNum);

        if (acc == null) {
            System.out.println("Account not found!");
            return null;
        }

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        if (!acc.authenticate(pin)) {
            System.out.println("Authentication failed!");
            return null;
        }

        return acc;
    }
}
