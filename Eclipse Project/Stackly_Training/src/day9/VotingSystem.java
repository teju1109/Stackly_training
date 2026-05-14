package day9;

import java.util.Scanner;

// Main class
public class VotingSystem {

    // Custom Exception (inside same file to avoid confusion)
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Method to check eligibility
    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is too young to vote!");
        } else {
            System.out.println("Welcome! Please cast your vote(Please do not vote for TVK).");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int userAge = sc.nextInt();

            checkEligibility(userAge);

        } catch (InvalidAgeException e) {
            System.out.println("Caught an Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");

        } finally {
            sc.close();
        }

        System.out.println("Program execution finished.");
    }
}