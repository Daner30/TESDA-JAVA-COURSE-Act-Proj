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
            System.out.println("5. Run Task6 (Even numbers until 237)");
            System.out.println("6. Run Task7 (Arithmetic operations)");
            System.out.println("7. Run Task8 (Varargs cumulative sum)");
            System.out.println("8. Run Task9 (Math operations with static import)");
            System.out.println("9. Run Task10 (Print student full names)");
            System.out.println("10. Run Task11 (Book details with toString)");
            System.out.println("11. Run Task12 (Point scaling)");
            System.out.println("12. Run Task13 (Vehicle and Car inheritance)");
            System.out.println("13. Run Task14 (Abstract class and subclasses)");
            System.out.println("14. Run Task15 (Shapes with interface and abstract class)");
            System.out.println("15. Run Task16 (Gorilla implements Animal)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Yabaiiii. Paki pili po ng tamang numero para hindi tayo magkasayangan ng oras :)");
                scanner.nextLine();
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

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
                case 5:
                    Task6.run();
                    break;
                case 6:
                    Task7.run(scanner);
                    break;
                case 7:
                    Task8.run(scanner);
                    break;
                case 8:
                    Task9.run(scanner);
                    break;
                case 9:
                    Task10.run();
                    break;
                case 10:
                    Task11.run();
                    break;
                case 11:
                    Task12.run();
                    break;
                case 12:
                    Task13.run();
                    break;
                case 13:
                    Task14.run();
                    break;
                case 14:
                    Task15.run();
                    break;
                case 15:
                    Task16.run();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Yabaiiii. Paki pili po ng tamang numero para hindi tayo magkasayangan ng oras :)");
            }
        } while (choice != 0);

        scanner.close();
    }
}