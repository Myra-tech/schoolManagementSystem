package teachers;

public abstract class Teacher {
    public String teacherName;
    private int teacherAge;
    public String teacherQualification;

    public void theCourseTaught(String courseTitle, String courseCode) {

    }

    public abstract String teacherQualifications(int yearsInEducation);

    public int getTeacherAge() {return teacherAge;}

}
