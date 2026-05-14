package day3;

import java.util.Scanner;

public class StudentReport {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Subject 1 Marks: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Subject 3 Marks: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        String grade;

        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 75) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else if (avg >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n----- Report Card -----");
        System.out.println("Name   : " + name);
        System.out.println("Marks  : " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total  : " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade  : " + grade);
    }

}
