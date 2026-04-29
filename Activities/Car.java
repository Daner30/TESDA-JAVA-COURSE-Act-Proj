package Activities;

public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // call Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
