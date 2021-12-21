package teachers;

public class MathFaculty extends Teacher {

    public MathFaculty(String teacherName) {
        super(teacherName);
    }

    @Override
    public String teacherQualifications(int yearsInEducation) {
        if (yearsInEducation >= 4 && yearsInEducation < 6) {
            teacherQualification = "Teaching Assistance licence";
        } else if (yearsInEducation >= 6) {
            teacherQualification = "Certified Statement of Eligibility";
        } else {
            teacherQualification = "Not eligible";
        }
        return teacherQualification;
    }

    @Override
    public String theCourseTaught(String courseTitle, String courseCode) {
        super.theCourseTaught(courseTitle, courseCode);
        return courseCode + ": " + courseTitle;
    }
}
