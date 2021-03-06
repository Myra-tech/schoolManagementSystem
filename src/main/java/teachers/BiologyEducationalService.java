package teachers;

public class BiologyEducationalService extends Teacher {

    public BiologyEducationalService(String teacherName) {
        super(teacherName);
    }

    @Override
    public String teacherQualifications(int yearsInEducation) {
        if (yearsInEducation >= 4 && yearsInEducation < 6) {
            teacherQualification = "Teaching Assistance licence";
            // System.out.println(teacherQualification);  <--- Šo te visp
        } else if (yearsInEducation >= 6) {
            teacherQualification = "Certified Statement of Eligibility";
            // System.out.println(teacherQualification);
        } else {
            teacherQualification = "Not eligible";
            // System.out.println(teacherQualification);
        }
        return teacherQualification;
    }

    @Override
    public String theCourseTaught(String courseTitle, String courseCode) {
        super.theCourseTaught(courseTitle, courseCode);
        return courseCode + ": " + courseTitle;
    }
}
