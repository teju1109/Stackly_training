package day7;

public class StudentMarks {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[3][3];

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {

                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nStudent Marks:");

        for (int i = 0; i < 3; i++) {

            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < 3; j++) {

                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }
    }
}
