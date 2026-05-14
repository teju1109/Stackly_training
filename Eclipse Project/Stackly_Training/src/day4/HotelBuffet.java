package day4;

import java.util.Scanner;

public class HotelBuffet {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Veg Menu");
        System.out.println("2. Non-Veg Menu");
        System.out.print("Select Menu: ");
        int menu = sc.nextInt();

        int price = 0;

        switch (menu) {

            case 1:
                System.out.println("1. Idli - 50");
                System.out.println("2. Dosa - 70");
                System.out.print("Choose Item: ");
                int veg = sc.nextInt();

                switch (veg) {
                    case 1:
                        price = 50;
                        System.out.println("You selected Idli");
                        break;
                    case 2:
                        price = 70;
                        System.out.println("You selected Dosa");
                        break;
                    default:
                        System.out.println("Invalid Veg Item");
                }
                break;

            case 2:
                System.out.println("1. Chicken Biryani - 150");
                System.out.println("2. Fish Fry - 120");
                System.out.print("Choose Item: ");
                int nonveg = sc.nextInt();

                switch (nonveg) {
                    case 1:
                        price = 150;
                        System.out.println("You selected Chicken Biryani");
                        break;
                    case 2:
                        price = 120;
                        System.out.println("You selected Fish Fry");
                        break;
                    default:
                        System.out.println("Invalid Non-Veg Item");
                }
                break;

            default:
                System.out.println("Invalid Menu Choice");
        }

        if (price > 0) {
            System.out.println("Total Price: " + price);
        }
    }

}
