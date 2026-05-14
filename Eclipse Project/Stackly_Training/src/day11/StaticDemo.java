package day11;

public class StaticDemo {
	// Static variables (shared by all objects)
    static String collegeName = "Global University";
    static int studentCount = 0;

    // Instance variables (unique for each object)
    String studentName;
    int rollNo;

    // Constructor
    public StaticDemo(String name) {
        this.studentName = name;
        studentCount++;              // increase count
        this.rollNo = studentCount;  // assign roll number
    }

    // Static method
    static void changeCollege(String newName) {
        collegeName = newName;
    }

    // Instance method
    void displayInfo() {
        System.out.println("Roll No: " + rollNo +
                           " | Name: " + studentName +
                           " | College: " + collegeName);
    }

    // Main method
    public static void main(String[] args) {

        // Access static variable
        System.out.println("Initial College: " + StaticDemo.collegeName);

        // Create objects
        StaticDemo s1 = new StaticDemo("Alice");
        StaticDemo s2 = new StaticDemo("Bob");

        // Display info
        s1.displayInfo();
        s2.displayInfo();

        // Change college name
        StaticDemo.changeCollege("Tech Institute");

        System.out.println("\n--- After College Name Update ---");

        // Display again
        s1.displayInfo();
        s2.displayInfo();

        // Total students
        System.out.println("Total Students created: " + StaticDemo.studentCount);
    }
}
