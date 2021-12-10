import java.util.Scanner;

public class StudentController {

    static Scanner scanner = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter a name of the student: ");
        String name = scanner.nextLine();

        System.out.print("Enter a surname of the student: ");
        String surname = scanner.nextLine();

        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the course code: ");
        int courseID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the name of the course: "); // here you can create a drop-down menu
        String courseEnrolled = scanner.nextLine();
    }
}
