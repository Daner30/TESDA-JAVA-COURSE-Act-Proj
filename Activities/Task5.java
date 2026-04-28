package Activities;

import java.util.Scanner;

public class Task5 {
    public static void run(Scanner scanner) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            int largest = num1;
            if (num2 > largest) largest = num2;
            if (num3 > largest) largest = num3;

            System.out.println("The largest number is: " + largest);
        }
    }
}
