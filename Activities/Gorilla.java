package Activities;

public class Gorilla implements Animal {
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Feeding the gorilla... Food placed in cage.");
            return true;
        } else {
            System.out.println("Not feeding time yet.");
            return false;
        }
    }

    @Override
    public void groom() {
        System.out.println("Grooming the gorilla... lather, rinse, repeat.");
    }

    @Override
    public void pet() {
        System.out.println("Petting the gorilla... pet at your own risk!");
    }
}
