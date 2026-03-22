import java.util.Scanner;

public class FindHigestLowestMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Assume first element is max & min
        int max = marks[0];
        int min = marks[0];

        // Traversal + Condition
        for (int i = 1; i < n; i++) {

            if (marks[i] > max) {
                max = marks[i];
            }

            if (marks[i] < min) {
                min = marks[i];
            }
        }

        System.out.println("\nResult:");
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);

        sc.close();
    }
}