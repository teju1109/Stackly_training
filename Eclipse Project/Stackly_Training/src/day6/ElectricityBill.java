package day6;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalBill = 0;

        for (int i = 1; i <= 6; i++) {

            System.out.print("Enter electricity bill for month " + i + ": ");
            double bill = sc.nextDouble();

            totalBill = totalBill + bill;
        }

        System.out.println("Total electricity bill for 6 months = RS " + totalBill);
    }
}
