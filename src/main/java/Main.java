import teachers.BiologyEducationalService;

public class Main {

       public static void main (String[] args) {

           Statistics bayesianStatistics = new Statistics();
           Math linearAlgebra = new Math();
           Biology neuroBiology = new Biology();

           Course<Statistics> statisticsCourse = new Course<Statistics>(bayesianStatistics);
           Course<Math> mathCourse = new Course<Math>(linearAlgebra);
           Course<Biology> biologyCourse = new Course<Biology>(neuroBiology);

           statisticsCourse.sitAnExam();
           mathCourse.sitAnExam();
           biologyCourse.sitAnExam();

           BiologyEducationalService biologyTeachers = new BiologyEducationalService();
           biologyTeachers.teacherName = "Rosie Smith";
           biologyTeachers.teacherQualifications(4);
           biologyTeachers.theCourseTaught("Introduction to Evolution", "Bio101");


    }
}
