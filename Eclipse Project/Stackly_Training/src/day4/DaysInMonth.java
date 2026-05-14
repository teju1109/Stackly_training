package day4;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int days;

        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }

        System.out.println("Number of days: " + days);
    }
}
