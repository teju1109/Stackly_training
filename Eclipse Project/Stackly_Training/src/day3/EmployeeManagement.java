package day3;

import java.util.Scanner;

public class EmployeeManagement {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Designation: ");
        String desig = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double gross = basic + hra + da;

        double tax = gross * 0.10;
        double net = gross - tax;

        System.out.println("\n----- Employee Details -----");
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + dept);
        System.out.println("Designation : " + desig);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary  : " + net);
    }

}
