package BankingApp;
import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Online Banking App ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.println("7. Show My Transactions");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: bank.createAccount(scanner); break;
                case 2: bank.deposit(scanner); break;
                case 3: bank.withdraw(scanner); break;
                case 4: bank.transfer(scanner); break;
                case 5: bank.checkBalance(scanner); break;
                case 6: System.out.println("Goodbye!"); return;
                case 7: bank.showAccountTransactions(scanner); break;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
