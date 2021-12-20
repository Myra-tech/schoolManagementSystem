package teachers;

public class BiologyEducationalService extends Teacher {

    @Override
    public String teacherQualifications(int yearsInEducation) {
        if (yearsInEducation >= 4 && yearsInEducation < 6) {
            teacherQualification = "Teaching Assistance licence";
            System.out.println(teacherQualification);
        } else if (yearsInEducation >= 6) {
            teacherQualification = "Certified Statement of Eligibility";
            System.out.println(teacherQualification);
        } else {
            teacherQualification = "Not eligible";
            System.out.println(teacherQualification);
        }
        return teacherQualification;
    }

    @Override
    public void theCourseTaught(String courseTitle, String courseCode) {
        super.theCourseTaught(courseTitle, courseCode);
    }
}
