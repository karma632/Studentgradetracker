package studenttracker;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Grademanager manager = new Grademanager();

        System.out.print("How many students?");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {

            System.out.print("\nEnter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter grade(score): ");
            int grade = scanner.nextInt();
            scanner.nextLine();

            manager.addStudent(name, grade);
        }

        manager.displayReport();

        scanner.close();
    }
}