package Activities;

class Student {
    private String firstName;
    private String lastName;

    // Constructor
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to print full name
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }
}

public class Task10 {
    public static void run() {
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };

        // Enhanced for loop
        for (Student s : students) {
            s.printFullName();
        }
    }
}
