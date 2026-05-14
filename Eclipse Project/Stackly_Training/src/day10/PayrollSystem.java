package day10;

import java.util.Scanner;

public class PayrollSystem {
	static String[] names = {"Alice", "Bob", "Charlie"};
    static double[] salaries = {5000, 6000, 7000};

    public double getBonus(double s) {
        return s * 0.10; 
    }

    public double getIncrement(double s, double p) {
        return s * (p / 100);
    }

    public static void showNet(double s) {
        double tax = s * 0.15;
        System.out.println("Net Salary after Tax: " + (s - tax));
    }

    public static void welcome() {
        System.out.println("\n--- MENU ---");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayrollSystem obj = new PayrollSystem(); 
        int choice;

        do {
            welcome(); 
            System.out.println("1. Bonus\n2. Increment\n3. Net Salary\n4. Exit");
            System.out.print("Select: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter Employee ID (0, 1, or 2): ");
                int id = sc.nextInt();
                double s = salaries[id];

                if (choice == 1) {
                    double b = obj.getBonus(s);
                    System.out.println("Bonus for " + names[id] + ": " + b);
                } 
                else if (choice == 2) {
                    System.out.print("Enter %: ");
                    double p = sc.nextDouble();
                    System.out.println("Increment: " + obj.getIncrement(s, p));
                } 
                else if (choice == 3) {
                    showNet(s);
                }
            }
        } while (choice != 4);

        System.out.println("Closed.");
        sc.close();
    }
}
