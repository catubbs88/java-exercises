package exercises.school;

/**
 * Created by catub on 7/5/2017.
 */
public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public String getName() {
        return name;
    }

    protected void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    protected void setStudentId(int aStudentId) {
        if (aStudentId < 1) {
            throw new IllegalArgumentException("Student ID cannot be zero or negative.");
        }
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    protected void setNumberOfCredits(int aNumberOfCredits) {
        if (aNumberOfCredits < 0) {
            throw new IllegalArgumentException("Number of credits cannot be negative.");
        }
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    protected void setGpa(double aGpa) {
        if (aGpa < 0) {
            throw new IllegalArgumentException("GPA cannot be negative.");
        }
        gpa = aGpa;
    }


}
