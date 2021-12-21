package teachers;

public abstract class Teacher {
    private final String teacherName;
    private int teacherAge;
    public String teacherQualification;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String theCourseTaught(String courseTitle, String courseCode) {

        return courseTitle;
    }

    public abstract String teacherQualifications(int yearsInEducation);

    public int getTeacherAge() {return teacherAge;}

    public String getTeacherName() {
        return this.teacherName;
    }
}
