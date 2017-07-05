package exercises.school;

import java.util.ArrayList;

/**
 * Created by catub on 7/5/2017.
 */
public class Course {

    private String courseName;
    private int courseID;
    private ArrayList courseRoster = new ArrayList();

    public String getCourseName() {
        return courseName;
    }

    protected void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public int getCourseID() {
        return courseID;
    }

    protected void setCourseID(int aCourseID) {
        courseID = aCourseID;
    }

    public ArrayList getCourseRoster() {
        return courseRoster;
    }

    protected void addStudent(Student student) {
        courseRoster.add(student);
    }

}
