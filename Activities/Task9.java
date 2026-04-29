package Activities;

// Static import of Math methods
import static java.lang.Math.*;

import java.util.Scanner;

public class Task9 {
    // Addition using Math.addExact()
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Subtraction using Math.subtractExact()
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Multiplication using Math.multiplyExact()
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Division using Math.floorDiv()
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return floorDiv(a, b);
    }

    public static void run(Scanner scanner) {
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        System.out.println("Addition of " + x + " and " + y + " = " + add(x, y));
        System.out.println("Subtraction of " + x + " and " + y + " = " + subtract(x, y));
        System.out.println("Multiplication of " + x + " and " + y + " = " + multiply(x, y));
        System.out.println("Division of " + x + " and " + y + " = " + divide(x, y));
    }
}
