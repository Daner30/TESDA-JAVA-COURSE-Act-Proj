package Activities;

import java.util.Scanner;

public class Task8 {
    public static int processNumbers(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            totalSum += num;

            int cumulative = 0;
            for (int i = 1; i <= num; i++) {
                cumulative += i;
            }

            System.out.println("Cumulative sum for " + num + " = " + cumulative);
        }

        return totalSum;
    }

    public static void run(Scanner scanner) {
        System.out.print("How many numbers will you enter? ");
        int count = scanner.nextInt();

        int[] inputs = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            inputs[i] = scanner.nextInt();
        }

        int result = processNumbers(inputs);
        System.out.println("Total sum of parameters = " + result);
    }
}
