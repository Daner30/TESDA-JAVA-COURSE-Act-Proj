package Activities;

public class Task12 {
    public static void run() {
        Point p = new Point(32, 32);

        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}
