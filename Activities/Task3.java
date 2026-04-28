package Activities;

public class Task3 {
    public static void run() {
        String a = "Wow";
        String b = "Wow";

        //Should be different to a to beccome true
        String c = "Wew";
        //Should be same as b + "!" to become true
        String d = "Wow!";

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}