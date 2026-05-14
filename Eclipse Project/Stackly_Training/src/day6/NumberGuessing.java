package day6;

import java.util.Scanner;

public class NumberGuessing {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int secretNumber = 50;

	        for (int i = 1; i <= 3; i++) {

	            System.out.print("Enter your guess: ");
	            int guess = sc.nextInt();

	            if (guess == secretNumber) {
	                System.out.println("Number is correct");
	                break;
	            } 
	            else if (guess < secretNumber) {
	                System.out.println("Number is Small");
	            } 
	            else if (guess > secretNumber) {
	                System.out.println("Number is big");
	            }
	            else {
	                System.out.println("Number is invalid");
	            }
	        }
	    }
}
