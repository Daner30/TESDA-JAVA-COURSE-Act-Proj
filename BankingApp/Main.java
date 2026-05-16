package BankingApp;
import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Welcome to ALKANSIYA ===");
            System.out.println("1. Login");
            System.out.println("2. New Account");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Account loggedIn = bank.login(scanner);
                    if (loggedIn != null) {
                        userMenu(loggedIn);
                    }
                    break;
                case 2:
                    bank.createAccount(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void userMenu(Account acc) {
        while (true) {
            System.out.println("\n=== Banking Features ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer Funds");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Logout");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: bank.deposit(scanner, acc); break;
                case 2: bank.withdraw(scanner, acc); break;
                case 3: bank.transfer(scanner, acc); break;
                case 4: bank.checkBalance(acc); break;
                case 5: bank.showAccountTransactions(acc); break;
                case 6: System.out.println("Logged out."); return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
