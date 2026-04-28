package Activities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println("\n=== Task Menu ===");
            System.out.println("1. Run Task2 (Primitives concatenation)");
            System.out.println("2. Run Task3 (String comparison success)");
            System.out.println("3. Run Task4 (Palindrome checker)");
            System.out.println("4. Run Task5 (Largest of three numbers)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // clear bad input
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Task2.run();
                    break;
                case 2:
                    Task3.run();
                    break;
                case 3:
                    Task4.run(scanner);
                    break;
                case 4:
                    Task5.run(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}