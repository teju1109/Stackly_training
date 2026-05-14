package day4;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Cannot divide by zero");
                return;
            }
        } else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result: " + result);
    }
}
