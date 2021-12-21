package courses;

public class Course <CourseType> {

    private final CourseType course;
        public Course(CourseType course) {
            this.course = course;
        }

        public void sitAnExam() {
            System.out.println("This student has sat an exam for the " + course + ".");
        }

    }
