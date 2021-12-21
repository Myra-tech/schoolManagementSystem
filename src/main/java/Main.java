import courses.Biology;
import courses.Course;
import courses.Math;
import courses.Statistics;
import teachers.BiologyEducationalService;

public class Main {

    public static void main(String[] args) {

        Statistics bayesianStatistics = new Statistics();
        Math linearAlgebra = new Math();
        Biology neuroBiology = new Biology();

        Course<Statistics> statisticsCourse = new Course<Statistics>(bayesianStatistics);
        Course<Math> mathCourse = new Course<Math>(linearAlgebra);
        Course<Biology> biologyCourse = new Course<Biology>(neuroBiology);

        statisticsCourse.sitAnExam();
        mathCourse.sitAnExam();
        biologyCourse.sitAnExam();

        BiologyEducationalService biologyTeachers = new BiologyEducationalService("Rosie Smith");
        // biologyTeachers.teacherName = "Rosie Smith";

        try {
            System.out.println(biologyTeachers.getTeacherName() + " teaches "
                    + biologyTeachers.theCourseTaught("Introduction to Evolution", "Bio101")
                    + ". Qualifications: " + biologyTeachers.teacherQualifications(4));

        } catch (Exception error) {
            error.getMessage();
        }

    }
}
