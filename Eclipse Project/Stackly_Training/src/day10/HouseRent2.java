package day10;

import java.util.Scanner;

public class HouseRent2 {
	static void searchOwner(String[] owner, String[] tenant, String[] type, String name) {

        for (int i = 0; i < owner.length; i++) {

            if (owner[i].equalsIgnoreCase(name)) {
                System.out.println("Owner: " + owner[i]);
                System.out.println("Tenant: " + tenant[i]);
                System.out.println("Type: " + type[i]);
                return; // stop after finding
            }
        }

        System.out.println("Owner not found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] owner = {"Ravi", "Suresh", "Anita"};
        String[] tenant = {"Kiran", "Meena", "Rahul"};
        String[] type = {"rent", "lease", "rent"};
        System.out.print("Enter owner name: ");
        String name = sc.nextLine();
        searchOwner(owner, tenant, type, name);

        sc.close();
    }
}
