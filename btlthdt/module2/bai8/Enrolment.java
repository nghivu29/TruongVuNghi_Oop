package btlthdt.module2.bai8;

public class Enrolment {
    private String status;
    private String grade;
    private float numGrade;
    private Student student;

    public Enrolment(Student student, String grade, String status, float numGrade) {
        this.status = status;
        this.grade = grade;
        this.numGrade = numGrade;
        this.student = student;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getNumGrade() {
        return numGrade;
    }

    public void setNumGrade(float numGrade) {
        this.numGrade = numGrade;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-20s%-15s%-15s\n"
                , student.getStudentID(), student.firstName+" "+student.lastName, student.getYearMatriculated(), numGrade);
    }
}
