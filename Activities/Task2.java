package Activities;

public class Task2 {
    public static void run() {
        // Declare primitives
        byte three = 3;
        short one = 1;
        int zero = 0;
        float twoPointZero = 2.0f;
        char H = 'H';
        char w = 'w';
        char r = 'r';
        char l = 'l';
        char d = 'd';
        boolean truth = true;

        // Concatenate into the desired string
        String output = "" + H + three + one + one + zero + " " 
                        + w + zero + r + l + d + " " 
                        + twoPointZero + " " 
                        + truth;

        // Print result
        System.out.println(output);
    }
}
