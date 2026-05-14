package day4;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUser = "admin";
        String correctPass = "1234";

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(correctUser)) {
            if (pass.equals(correctPass)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Wrong Password");
            }
        } else {
            System.out.println("Invalid Username");
        }
    }

}
