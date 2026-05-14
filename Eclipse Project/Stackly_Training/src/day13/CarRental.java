package day13;

import java.util.Scanner;

class CarRental {
    void calculateRent(int hours) {
        int pricePerHour = 200;
        int total = hours * pricePerHour;

        System.out.println("Hours : " + hours);
        System.out.println("Price Per Hour : " + pricePerHour);
        System.out.println("Total Rent : " + total);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter Number of Hours : ");
            int hours = sc.nextInt();

            CarRental c = new CarRental();
            c.calculateRent(hours);
            System.out.println("Thank You!");
           }
     }
}