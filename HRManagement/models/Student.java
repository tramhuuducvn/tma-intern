package HRManagement.models;

public class Student extends Human {

    public Student(String firstName, String lastName, float grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    protected float grade;

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " [grade=" + grade + "]";
    }

}
