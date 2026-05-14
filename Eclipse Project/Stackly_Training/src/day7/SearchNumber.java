package day7;

public class SearchNumber {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                System.out.println("Number found at index: " + i);
                return;
            }
        }

        System.out.println("Number not found");
    }
}
