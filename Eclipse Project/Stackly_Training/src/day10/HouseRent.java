package day10;

public class HouseRent {
	static int calculateRent(int rentAmount, int noOfMonths) {
        int totalRent = rentAmount * noOfMonths;
        return totalRent;
    }

    public static void main(String[] args) {

        int rentAmount = 5000;
        int noOfMonths = 6;

        int result = calculateRent(rentAmount, noOfMonths);

        System.out.println("Total Rent = " + result);
    }
}
