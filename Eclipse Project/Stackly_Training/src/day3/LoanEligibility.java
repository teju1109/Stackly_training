package day3;

import java.util.Scanner;

public class LoanEligibility {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int credit = sc.nextInt();

        if (age >= 21) {
            if (salary >= 25000) {
                if (credit >= 700) {
                    System.out.println("Loan Approved");
                } else {
                    System.out.println("Loan Rejected: Low Credit Score");
                }
            } else {
                System.out.println("Loan Rejected: Low Salary");
            }
        } else {
            System.out.println("Loan Rejected: Age not eligible");
        }
    }
}
