package day3;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + (units - 100) * 2.5;
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + (units - 200) * 4;
        }

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Name  : " + name);
        System.out.println("Units : " + units);
        System.out.println("Bill  : " + bill);
    }

}
