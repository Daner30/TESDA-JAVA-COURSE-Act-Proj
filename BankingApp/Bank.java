package BankingApp;
import java.util.*;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    // Create a new account
    public void createAccount(Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Phone Number (Account Number): ");
        String accNum = scanner.nextLine();

        if (accounts.containsKey(accNum)) {
            System.out.println("Account already exists!");
            return;
        }

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        System.out.print("Set a Password: ");
        String password = scanner.nextLine();

        System.out.print("Set a PIN: ");
        String pin = scanner.nextLine();

        System.out.print("Enter initial deposit: ");
        double deposit = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Account newAcc = new Account(accNum, name, dob, password, pin, deposit);
        accounts.put(accNum, newAcc);
        System.out.println("Account created successfully!");
    }

    // Login
    public Account login(Scanner scanner) {
        System.out.print("Enter Phone Number (Account Number): ");
        String accNum = scanner.nextLine();
        Account acc = accounts.get(accNum);

        if (acc == null) {
            System.out.println("Account not found!");
            return null;
        }

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        if (acc.authenticate(password, pin)) {
            System.out.println("Login successful! Welcome " + acc.getOwnerName());
            return acc;
        } else {
            System.out.println("Authentication failed!");
            return null;
        }
    }

    // Banking features (require logged-in account)
    public void deposit(Scanner scanner, Account acc) {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        acc.deposit(amount);
        System.out.println("Deposit successful. New balance: " + acc.getBalance());
    }

    public void withdraw(Scanner scanner, Account acc) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (acc.withdraw(amount)) {
            System.out.println("Withdrawal successful. New balance: " + acc.getBalance());
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void transfer(Scanner scanner, Account sourceAcc) {
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
            destAcc.addTransfer(amount, sourceAcc.getAccountNumber(), false);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void checkBalance(Account acc) {
        System.out.println("Account Balance: " + acc.getBalance());
    }

    public void showAccountTransactions(Account acc) {
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
