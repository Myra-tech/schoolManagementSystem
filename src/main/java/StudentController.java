import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Students> studentlist = new ArrayList<Students>();

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

    private static void searchStudent(int id) {
        boolean search = true;
        for (Students st : studentlist) {
            if (st.getId() == id) {
                System.out.println("Student Id: " + st.getId() + " Student Name: " + st.getName()
                        + " Age: " + st.getAge() + " courses.Course enrolled: " + st.getCourseEnrolled());
                search = false;
            }
        }
        if (search) {
            System.out.println(id + " does not exist");
        }
    }
}
